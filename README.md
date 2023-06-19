# Description
This Project can be used to generate AI Training Data for GANs and DCGANs.

You can generate JPEG Image Files with a Cross and RGB Circles inside.

# Usage
## Build the project
```bash Gradle Build
./gradlew build
```

## How to use

### Requirements
- Java 17

Arguments: width height amount outputdir

```bash 
java -jar cig.jar 128 128 5000 train
``` 
This will generate 5000 Images with a size of 128x128 Pixel in the train directory.

# Author
Samuel Abramov.

# License
MIT License

Copyright (c) [2023] [Samuel Abramov]

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
