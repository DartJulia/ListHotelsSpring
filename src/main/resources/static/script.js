/**
 * 
 */
var ourRequest = new XMLHttpRequest();
// this will open the connection and allow us to get some data
// the first parameter is what we to do
// the second parameter will be json url

outRequest.open("GET","https://swapi.co/api/people/5/?format=json");

ourRequest.send();

console.log(ourRequest.responseText);