# small-java-test
Create a class with two methods, "encode" and "decode".

Background
Create a class with two methods, "encode" and "decode". The methods have some properties
outlined below:
 Each method takes a message String and an int representing the number of rotations in the
code.
 Each method returns a String, which is the encoded or decoded message.
 Encoding and decoding only affects alphabetical characters that are contained in the US
ASCII standard.
 All other characters are unaffected.
 The encoding of a character with a given number of rotations is the character that
alphabetically succeeds its "rotations" times.
o When rotating an alphabetical character, to rotate past the end of the alphabet is to
continue on the other end of the alphabet.
 For example, 'e' encoded with 5 rotations is 'j'; 'z' encoded with 1 rotation is
'a'; 'X' encoded with 7 rotations is 'E'.
 The decoding of a character is the inverse function of the encoding of a character.
o For example, 'j' decoded with 5 rotations is 'e'; 'a' decoded with 1 rotation is 'z'; 'E'
decoded with 7 rotations is 'X'.
For example, the word “HELLO” encoded with 5 rotations is “MJQQT”. The word “BTWQI”
decoded with 5 rotations is “WORLD”.
INSTRUCTIONS
Write this class. Encode the String "innoWake rules" with 9 rotations and decode the String
“IUHUR" with 6 rotations.
Return your written solution including the Java sourcecode. 
