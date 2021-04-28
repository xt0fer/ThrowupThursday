# Throwup Thursday

This example creates two objects Person and Book. Th eperson object has both a Controller and repository.

It's a VERY simple spring example, shows how to build a few simple GETs inclusing one "add" where the GET creates an object based on some Params on the URL, and then returns the created object.

POST is left as an exercise for the reader.

*Use Spring, and HAL Browser (for Spring Data REST) to create a couple of POJOs (Book and Person) and
a framework so that we can mock up some data in spring, and then generate
JSON and other marvels.*

**Run and then point a browser to [http://localhost:8080/]()**

## New and Improved!! As seen ov TV! 
## ThrowupThursday can now talk to a MySQL db running on your machine.

Yes, that's right, you can do a very simple CRUDRepository in Spring to suply the data you need!

You're welcome.

## New and Improved! Now with the earth-shattering SimpleMonday Client!!

Then open VSC on the SAME project. 
Go into frontend/SimpleMonday and find a simple Ionic 3 client, which can talk to the 
Spring server above, fetch a single GET from the server display the results in the People tab of the 
SimpleMonday client.

BUT to make this work, you need to go to [http://localhost:8100]() with the Chrome browser, and then
download and INSTALL this extension: https://chrome.google.com/webstore/detail/cors-toggle/jioikioepegflmdnbocfhgmpmopmjkim
That will allow the SimpleMonday client to load the JSON from localhost:8080
Otherwise the SimpleMonday client runs afoul of CORS (look it up).


#### Kris and Wilhem wrote this, because we feel sorry for the poor Zipcoder-wanna-bees.

