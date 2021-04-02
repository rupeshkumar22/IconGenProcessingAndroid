# Icon Generator for Processing Android Sketches
Generate required icons for Processing Android Mode's sketch with an image.
Icons are required to be placed in sketch's folder in oreder to sign the package as mentioned on the official [website](https://android.processing.org/tutorials/distributing/index.html)

Steps to create icons:
Place required image in root of this project and rename it as 'myimg.jpg'.(512x512 required)
Run- 'javac Mine.java' under the root directory.
Then Run- 'java Mine' under the root directory.

This will create the the following required icons for the the processing android mode's sketch:
icon-36.png
icon-48.png
icon-72.png
icon-96.png
icon-144.png
icon-192.png

To sign the packages it is required to place the icons in the sketch folder and 
to edit the package name in the Manifest file in the sketch's folder.

Processing Android GitHub [Repository](https://github.com/processing/processing-android)

