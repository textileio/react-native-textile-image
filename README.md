
# react-native-textile-image-view

## Getting started

`$ npm install react-native-textile-image-view --save`

### Mostly automatic installation

`$ react-native link react-native-textile-image-view`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-textile-image-view` and add `TextileImageView.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libTextileImageView.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import io.textile.textileimage.TextileImageViewPackage;` to the imports at the top of the file
  - Add `new TextileImageViewPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-textile-image-view'
  	project(':react-native-textile-image-view').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-textile-image-view/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-textile-image-view')
  	```


## Usage
```javascript
import TextileImageView from 'react-native-textile-image-view';

// TODO: What to do with the module?
TextileImageView;
```
  