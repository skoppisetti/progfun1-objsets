import objsets._

val s = "abc"
val c = s.getClass.toString()

val keywords = List("ios", "iOS", "iphone", "iPhone", "ipad", "iPad")

val testSet = new NonEmpty(new Tweet("Test", "This is a test ios", 25), new Empty, new Empty)
val testSet2 = testSet.incl(new Tweet("Test2", "Second tweet", 5))

testSet2.foreach(println)



//TweetReader.allTweets.foreach(t => if(keywords.exists(t.text.contains)) matchedTweets.incl(t) else ())
val matchedTweets = new NonEmpty(new Tweet("T1","T1",1), new Empty, new Empty)
def found(t: Tweet, set: TweetSet): TweetSet = {
  //println("found " + t.text)
  //matchedTweets = set.incl(t)
  matchedTweets.incl(t)
}

//matchedTweets.incl(new Tweet("1","1",1))
//testSet2.foreach(t => if(keywords.exists(t.text.contains)) println(t) else ())
testSet2.foreach(t => if(keywords.exists(t.text.contains)) found(t, matchedTweets) else ())

//testSet2.foreach(t => matchedTweets.incl(new Tweet("1","1",1)))
matchedTweets.foreach(println)
println("Test Ends")

//val emptySet = new Empty
//val tweet1 = new Tweet("U1", "Tweet Test1", 2)
//val newSetWith1 = emptySet.incl(tweet1)
//newSetWith1.foreach(println)
TweetReader.allTweets




