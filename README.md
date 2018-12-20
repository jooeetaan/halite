# Halite

Halite Bot programming project built to learn AI.

Authors: Joseph Tan and Kelly Glebus

Website: https://halite.io

## Instructions on Making Changes  

All changes should be made in "dev" branch before being pushed to master. (To verify things work first).
To modify the dev branch, first clone the repo (this only needs to be done once):
`git clone https://github.com/jooeetaan/halite.git`
Navigate to the folder:
`ls halite`

Now, when actually doing changes:
`git pull` -> gets most recent changes.
Check out the dev branch:
`git checkout dev`
Make Changes
`//here is where you change the code, etc`
Commit your changes to the **dev** branch.
`git commit -a -m "commit message here"` -> -a is to commit all files
Push our changes to the dev branch
`git push`
Now switch to the master branch:
`git checkout master`
`git pull` -> optional. It will probably overwrite your changes to dev so you probably shouldn't
Now merge and handle any merge conflicts
`git merge dev`
