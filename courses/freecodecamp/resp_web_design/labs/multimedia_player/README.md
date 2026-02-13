Build a Multimedia Player
Build an app that is functionally similar to this example project. Try not to copy the example project, give it your own personal style.

In the prior lessons, you were introduced to working with audio and video elements. In this lab, you will build out a multimedia player that will display an audio track and video with a transcript.

For the audio element, you will need to include a source element which is used to specify the media being used.

Here is an example:
```
<audio controls aria-label="descriptive label goes here">
  <source src="url-to-audio-goes-here" type="audio/mpeg">
</audio>
```
The source element can also be used in the video element like this:
```
<video controls width="600" aria-label="descriptive label goes here">
  <source src="link-to-mp4-goes-here" type="video/mp4">
  <!--Remaining code goes here-->
</video>
```
Objective: Fulfill the user stories below and get all the tests to pass to complete the lab.

User Stories:

1. You should have an h1 element for the main title of the page.
2. You should have three section elements.
3. Inside the first section element, you should have an h2 element for the title of song playing.
4. Below the h2 element, you should have an audio element with controls attribute and an aria-label attribute.
5. Inside the audio element, you should have a source element with a src attribute pointing to an audio file and a type attribute. You are free to use this audio URL if you like: https://cdn.freecodecamp.org/curriculum/js-music-player/sailing-away.mp3
6. Inside the second section element, you should have an h2 element for the title of the video playing.
7. Below the h2 element, you should have a video element with controls, width attributes and an aria-label attribute.
8. Inside the video element, you should have a source element with a src attribute pointing to a video file and a type attribute. You are free to use this video URL if you like: https://cdn.freecodecamp.org/curriculum/labs/what-is-the-map-method-and-how-does-it-work.mp4
9. Below the source element, you should have a track element with a src attribute pointing to a subtitles file and a kind attribute, a srclang attribute and a label attribute. You are free to use this subtitles URL if you like: https://cdn.freecodecamp.org/curriculum/labs/what-is-the-map-method-and-how-does-it-work.vtt
10. Inside the third section element, you should have an h2 element for the title of the section eg. "Transcript".
11. Below the h2 element, you should have a p element with the transcript of the video.

Tests
1. You should have an h1 element.
2. Your h1 should have some text representing the main title of the page.
3. You should have three section elements.
4. The first section should contain an h2 element.
5. Your h2 should have some text representing the title of the song playing.
6. The first section should contain an audio element.
7. Your audio element should have a controls attribute.
8. Your audio element should have an aria-label attribute with text describing the audio.
9. Your audio element should have a source element.
10. Your source element should have a src attribute pointing to an audio file.
11. Your source element should have a type attribute with a value specifying the type of the audio.
12. The second section should contain an h2 element.
13. Your h2 should have some text representing the title of the video playing.
14. The second section should contain a video element.
15. Your video element should have a controls attribute.
16. Your video element should have a width attribute with a value specifying the width of the video.
17. The video element should have a source element.
18. The source element should have a src attribute pointing to a video file.
19. The source element should have a type attribute with a value specifying the type of video.
20. Your video element should have a track element.
21. Your track element should have a src attribute pointing to a subtitles file.
22. Your track element should have a kind attribute with text describing the kind of file.
23. Your track element should have a srclang attribute with text describing the language of the subtitles.
24. Your track element should have a label attribute with text describing the language of the subtitles.
25. The third section should contain an h2 element.
26. Your h2 should have some text representing the title of the section.
27. The third section should contain a p element for the transcript.

Starting code:
```
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Multimedia Player</title>
</head>

<body>

</body>

</html>
```
