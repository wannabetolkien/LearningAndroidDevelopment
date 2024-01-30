fun main() {
    print("Enter your choice ! : ")
    var userChoice:String=readln().uppercase()
    while(userChoice!="ROCK" && userChoice!="PAPER" && userChoice!="SCISSOR"){
        print("Enter your choice ! : ")
        userChoice=readln().uppercase()
    }

    val computerChoice:String=when((1..<4).random()){
        1->"ROCK"
        2->"PAPER"
        3->"SCISSOR"
        else->"ROCK"
    }

    println("Computer Choice is : $computerChoice")

    when{
        (userChoice == computerChoice)->println("DRAW")

        (userChoice==("ROCK") && computerChoice==("SCISSOR"))->println("USER Wins !")

        (userChoice==("SCISSOR") && computerChoice==("PAPER"))->println("USER WINS !")

        (userChoice=="PAPER" && computerChoice=="ROCK")->println("USER WINS !")

        else->println("COMPUTER WINS !")
    }
}


