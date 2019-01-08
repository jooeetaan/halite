# Halite

Halite Bot programming project built to learn AI.

Authors: Joseph Tan and Kelly Glebus

Website: https://halite.io

## Instructions on changing the Bot

Make changes to MyBot.java

Run run_game.bat

Go to https://halite.io/watch-games#/replay-bot to watch the replay (upload HLT file)

To push changes, compile HLT and MyBot/java into a zip and uplaod to halite site.

## Instructions on Making Changes  

All changes should be made in "dev" branch before being pushed to master. (To verify things work first).

I'm not using github desktop for windows (that may have been a better idea in retrospect)

To modify the dev branch, first clone the repo (this only needs to be done once):

  `git clone git@github.com:jooeetaan/halite.git` -> this is for SSH keys.

  `git clone https://github.com/jooeetaan/halite.git` -> this is for HTTPS.

Navigate to the folder:

  `ls halite`

Now, when actually doing changes:

  `git pull` -> gets most recent changes.

Check out the dev branch:

  `git checkout dev`

Make Changes

  `//here is where you change the code, etc`

Commit your changes to the **dev** branch.

  `git add .` -> If you added a new file.
  `git commit -a -m "commit message here"` -> -a is to commit all files

Push your changes to the dev branch

  `git push`

Now switch to the master branch:

  `git checkout master`

  `git pull` -> probably don't do. It will probably overwrite your changes to dev if someone else did so you probably shouldn't

Now merge and handle any merge conflicts

  `git merge dev`

  `git push`

## Instructions on SSH Keys:

Derived From https://help.github.com/articles/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent/

Followed by: https://help.github.com/articles/adding-a-new-ssh-key-to-your-github-account/
