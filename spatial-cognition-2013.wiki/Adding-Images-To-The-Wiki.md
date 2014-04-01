Here is how I've been adding images to the wiki...



The wiki has its own git repository!, we're going to clone it and add images to it. Then we'll link to them in the markdown files for a wiki page. 

This can also serve as a quick intro to git.

If you've installed git for windows, you probably have a program called 'git bash' lying around somwhere.

## how I do it

change to a directory you want to clone the wiki
    
    $ cd ~/gitrepos

clone the wiki repository

    $ git clone https://github.com/bmoffatt/spatial-cognition-2013.wiki.git
    Cloning into 'spatial-cognition-2013.wiki'...
    Username for 'https://github.com': bmoffatt
    Password for 'https://bmoffatt@github.com': 
    remote: Counting objects: 420, done.
    remote: Compressing objects: 100% (409/409), done.
    remote: Total 420 (delta 232), reused 7 (delta 1)
    Receiving objects: 100% (420/420), 2.22 MiB | 745.00 KiB/s, done.
    Resolving deltas: 100% (232/232), done.
    Checking connectivity... done

cd into the repository
    
    $ cd spatial-cognition-2013.wiki/

you should see the files of the wiki!

    $ ls
    Original-Outline:---Testee-Use-Case:---Taking-a-Test.md
    Testee-Use-Case:-Environment-Navigation:-Guided-Prompts.md
    Testee-Use-Case:-Environment-Navigation:-Pokemon-Snap.md
    ...
    Tutorial-links-and-bits-of-code.md
    home.md
    images

place image into the image directory of the repository

    $ cp ~/Downloads/my_awesome_picture.png images/

add the picture to the current change set

    $ git add images/my_awesome_picture.png 

Now we're gonna add a link to it in the wiki. you could do this through the web interface on our project repo, but i'm gonna do it locally.


to link to an image, we add the following to the markdown file where we want the file image to go.

    ![alt text](url)

for our new image this looks like

    ![an awesome image](images/random/my_awesome_picture.png)

and here it is in the page!
![an awesome image](images/random/my_awesome_picture.png)

Since i'm changing the wiki locally, I should add it!

    $ git add Adding-Images-To-The-Wiki.md

Now i'll commit my changes, and push them to our github repo

    $ git commit -m "adding images to the wiki"
    [master 3c26436] adding images to the wiki
    2 files changed, 22 insertions(+), 16 deletions(-)
    create mode 100644 images/my_awesome_picture.png
    $ git push origin master
    Username for 'https://github.com': bmoffatt
    Password for 'https://bmoffatt@github.com': 
    Counting objects: 8, done.
    Delta compression using up to 4 threads.
    Compressing objects: 100% (5/5), done.
    Writing objects: 100% (5/5), 16.52 KiB | 0 bytes/s, done.
    Total 5 (delta 3), reused 0 (delta 0)
    To https://github.com/bmoffatt/spatial-cognition-2013.wiki.git
       d293646..3c26436  master -> master
    $


