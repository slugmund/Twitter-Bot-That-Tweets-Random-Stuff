const config=require('./config')
const twit=require('twit')
const T=new twit(config)
const fs = require('fs');
var BUFFER;

fs.readFile('/Users/hahayes/Desktop/PI/tweet_Creator/Tweet/file.out','utf8', function (err,data){
    if(err){
        return console.log(err);
    }
    console.log(data);
    BUFFER = data;
    tweeter();
});

function tweeter() {
    var tweet = BUFFER;
    T.post('statuses/update', { status: tweet}, tweeted);

    function tweeted(err, data, response){
        if(err) {
            console.log(err);
        }else{
            console.log('Success: ' + data.text);
        }
    }
}