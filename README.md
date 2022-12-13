# NotesMessage
Toast Library

How to get a Git project into your build:

-----------------------------------------------------------------------

Step 1. Add the JitPack repository to your build file

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  Add it in your root build.gradle at the end of repositories:
  
  ---------------------------------------------------------------------
  
  Step 2. Add the dependency
  
  dependencies {
	        implementation 'com.github.Divyaammishra:NotesMessage:1.0.0'
	}
  
  ---------------------------------------------------------------------

