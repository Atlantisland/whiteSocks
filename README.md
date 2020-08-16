# whiteSocks
whiteSocks team repository for everyone codes coding contest 2020 

challenge provided by Catalysts GmbH

Challenge: Ranking System

Coding contests like the CCC and the School CCC are carried out via special contest servers. 
The participants register with their user ID (= UID) and get the specifications online.
The correctness is determined in the following way: The participants receive input data from the server which they feed into their program and whose output they upload again to the server (= submission). The uploaded data are then compared with the expected data on the server. If they match the respective task is fulfilled.
For the ranking during the contest the time needed for the fulfilled tasks is also important.
Help Catalysts to develop a Ranking System for their CatCoder!

Level 1
The Ranking System gets the time stamps in a human readable format. 
In order to compute how long it took a participant to submit the data, the Ranking System has to compute the time span between the start of the contest and the submission.
Your Task: Compute the time span between the start of the contest and a submission in seconds.

Input
Two time stamps separated by blanks, the start of the contest and the
time stamp of a submission.

Output
A whole number, the time span in seconds

Time Format:
Hours, minutes, and seconds, each as a two digit number, separated
by a colon (hh:mm:ss).

Examples:
13:24:58
02:59:03

Limitations
You can assume that no submission happens before the start of the
contest. Additionally, all time stamps are valid, i.e. between 00:00:00
and 23:59:59

Level 2
The Ranking System now has to handle multiple submissions. 
The submissions come from different users and may be correct or wrong.
Your Task: Find the first correct submission among all submissions!

Input
Time stamp of the start of the contest, number of submissions and a list of submissions, separated by a blank.

Output
UID and time stamp of the first correct submission

Format of a submission:
UID, time stamp and status, separated by a blank.
- UID denotes the User ID, a whole number
- Time stamp, as in Level 1 (hh:mm:ss)
- Status denotes whether a submission was correct or wrong UID and time stamp of the first correct submission

Examples:
1 13:03:24 correct
0 10:05:14 wrong 

Limitations
As in Level 1. Additionally:
- 0 <= UID <= 1000
- 1 <= number of submissions <= 1000
- There is at least one correct submission
- There are no submissions with the same time stamps

Level 3
The input is the same as in Level 2. 
However now we are not interested in the first correct solution, but in all correct solutions.
Your Task: Output all correct submissions sorted by time!

Input: (same as in Level 2)
Time stamp of the start of the contest, number of submissions and a list of submissions, separated by a blank.

Output:
Number of correct submissions and for each correct submission: UID and time stamp, separated by a blank.

Limitations: (same as in Level 2)
- Only valid time stamps
- Start of contest <= submission time stamp
- 0 <= UID <= 1000
- 1 <= number of submissions <= 1000
- There is at least one correct submission
- There are no submissions with the same time stamps
