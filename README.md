Git Commands Cheat Sheet
## 1. Setup & Configuration

git config --global user.name "Your Name"
Set your Git username globally

git config --global user.email "you@example.com"
Set your Git email globally

git config --global core.autocrlf true
Fix line endings on Windows (recommended)

git config --list
Show all Git config settings

## 2. Creating & Cloning Repos

git init
Initialize a new Git repository in the current folder

git clone <repository_url>
Clone a remote repo locally

## 3. Basic Snapshotting

git status
Show current branch and staged/untracked files

git add <file>
Stage a file for commit

git add .
Stage all changes in current directory

git commit -m "message"
Commit staged changes with message

git commit
Commit with default editor to write message

git diff
Show unstaged changes

git diff --staged
Show changes staged for commit

## 4. Branching & Merging

git branch
List all branches, show current with *

git branch <branch-name>
Create a new branch

git checkout <branch-name>
Switch to a branch

git checkout -b <branch-name>
Create and switch to a new branch

git merge <branch>
Merge another branch into current branch

git branch -d <branch-name>
Delete a branch (if merged)

git branch -D <branch-name>
Force delete a branch (even if unmerged)

## 5. Remote Repositories

git remote -v
List remote repositories

git remote add origin <url>
Add a remote repository

git remote set-url origin <url>
Change remote URL

git fetch
Fetch updates from remote (does not merge)

git pull
Fetch + merge remote changes into current branch

git push
Push commits to remote branch

git push --set-upstream origin <branch>
Push branch and set upstream tracking

## 6. Undoing Changes

git reset <file>
Unstage a file

git reset --hard
Reset all changes to last commit (WARNING: destructive)

git checkout -- <file>
Discard changes in working directory for a file

git revert <commit>
Create a new commit that undoes a previous commit

## 7. Stashing

git stash
Save current uncommitted changes temporarily

git stash list
List all stashed changes

git stash apply
Reapply latest stash (keeps stash)

git stash pop
Reapply and remove latest stash

## 8. Inspecting History

git log
Show commit history

git log --oneline --graph --all
Compact graphical log with branches

git show <commit>
Show details of a specific commit

git blame <file>
Show who changed each line of a file

## 9. Tags

git tag
List tags

git tag <tagname>
Create a tag at current commit

git push origin <tagname>
Push a tag to remote

git push --tags
Push all tags

## 10. Advanced

git cherry-pick <commit>
Apply a commit from another branch

git rebase <branch>
Reapply commits on top of another branch

git bisect
Binary search to find the commit introducing a bug

## Bonus: Windows CRLF Fix

git config --global core.autocrlf true