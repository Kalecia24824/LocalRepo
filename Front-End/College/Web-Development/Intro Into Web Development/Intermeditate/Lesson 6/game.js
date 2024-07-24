let game = { 
   winner : { 
      name: 'Broncos' , 
      score: '24'
    }, 
   loser : { 
      name: 'Panthers' , 
      score: '10' 
    }, 
    getMarginOfVictory: function() {
       return this.winner.score + " " + this.loser.score;
    },
    showSummary: function() {
       return this.winner.name + this.winner.score + " " + this.loser.name + this.loser.score;
    }
   }; 