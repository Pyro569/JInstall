# Intro
This program is a game/app installer meant for bypassing restrictions set in place on school/workplace computers. The entire app is built in java using the swing GUI library. As I want to make this program open source to allow potential help from people that want to join in on the project, I would like to state that I will not accept random pull requests for small things such as a typo in a comment. I will only accept pull requests that are meaningful and have purpose. 

# Setup
Please follow these instructions to set up the program on your computer for distribution.  
###### SIDE NOTE: I only compile standalone executable version when I have time. They are not a priority for me. Standalone versions will most likely be behind, behind from possibly major features or minor fixes and changes. If you want the most recent version, please compile it.
## Compiling (Linux)
###### Ubuntu/Debian
Open up terminal and run the following commands:  
sudo apt-get update  
sudo apt-get install git-all  
git clone https://github.com/Pyro569/JInstall --recursive  

Now run the files through your prefered way of compiling and then enjoy.
## Compiling (Windows)
To compile on windows, just download all the classes in a zip file then open them up in your prefered Java IDE (IntelliJ is recommended for compiling) and then build the project as you would normally.  
## Release
You can download a standalone executable version of the program from the repository by downloading it from the releases tab. Be aware that a standalone executable is not my priority and is updated at a slower pace than the rest of the project. (If you would like the newest version, you can compile it yourself) Please also be aware that the download is quite large (300MB+) due to having to pack in the entire JRE.

# Customization
To customize your installation of JInstall, you will need a basic text editor (Notepad will work) and a keyboard and mouse, as well as access to your file directories.

###### Benefits of Customizing JInstall
-Make it yours  
-Change installation directory (Can make the installation areas not hidden!)  
-Its easy and takes five minutes  

###### Cons of Customizing JInstall
-JInstall is configured to work perfectly as soon as it is installed  
-May stop working in some instances  
-More customization options may be added, which could reset your current customization.  

### How To Customize JInstall
Open up file explorer and head to the directory C:\Windows\tracing, here there will be a file called "JInstall.json", open that file up with a text editor.
There will be words (such as Install Directory) and then options/words sitting next to it (such as C:/windows/tracing/JInstall). Lets say your goal is to edit the directory in which programs are installed to. Lets just change the option seated next to Install Directory, in which the default option is C:/windows/tracing/JInstall. Change the C:/windows/tracing//JInstall to the directory you want it to install to. For example I want it to download to my scripts folder, so I would change it to C:/Scripts

# Contributing  
I will admit, I am not one to just use people's code that is in pull requests unless it is quite useful/wanted or I cannot figure out how to do it myself. I'd maybe place it as an ego thing, or maybe not, but I digress. Due to this, I probably won't look at pull requests unless I know of an outstandingly done and/or needed one that is sitting there. If I do need help with a certain part and do require help, I will most likely call upon and ask for help. Feel free to contribute however, even though I have just stated the former, I may be entertained by your contribution and add it.  

# Planned features 
-Add more options to customize
-Make the GUI look good
-Update feature
