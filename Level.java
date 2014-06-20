public class Level {
   int levelNumber;
   public Level(int levelNumber){
      levelNumber = levelNumber;
   }
   public EnemyShip placeEnemies(int levelNumber, long startTime1, long currentTime1, int enemyListSize1, ScreenManager s1){
      if (levelNumber == 1) {
         //int placeTime;
         long currentTime = currentTime1;
         long startTime = startTime1;
         int enemyListSize = enemyListSize1;
         ScreenManager s = s1;
         EnemyShip currentShip = null;
         EnemyShip currentShip1 = placeShip(new EnemySphere(), currentTime, startTime, 9000, 1, enemyListSize,0.1,0, 0, 50, s);
         if (currentShip1 !=null) {return currentShip1;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 9000, 2, enemyListSize,0.1,0, 0, 350, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 10000, 3, enemyListSize,0.1,0, 0, 400, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 10000, 4, enemyListSize,0.1,0, 0, 100, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 12000, 5, enemyListSize,0.1,0, 0, 200, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 12000, 6, enemyListSize,0.1,0, 0, 300, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 13000, 7, enemyListSize,0.1,0, 0, 500, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 13000, 8, enemyListSize,0.1,0, 0, 250, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 16000, 9, enemyListSize,0.1,0, 0, 350, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 16000, 10, enemyListSize,0.1,0, 0, 50, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 17000, 11, enemyListSize,0.1,0, 0, 200, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 17000, 12, enemyListSize,0.1,0, 0, 300, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 19000, 13, enemyListSize,0.1,0, 0, 450, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 19000, 14, enemyListSize,0.1,0, 0, 300, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 20000, 15, enemyListSize,0.1,0, 0, 350, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 20500, 16, enemyListSize,0.1,0, 0, 250, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 21000, 17, enemyListSize,0.1,0, 0, 500, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 21500, 18, enemyListSize,0.1,0, 0, 400, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 22000, 19, enemyListSize,0.1,0, 0, 500, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 23000, 20, enemyListSize,0.1,0, 0, 350, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 23500, 21, enemyListSize,0.1,0, 0, 50, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 24500, 22, enemyListSize,0.1,0, 0, 100, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 25000, 23, enemyListSize,0.1,0, 0, 200, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 25500, 24, enemyListSize,0.1,0, 0, 300, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 26000, 25, enemyListSize,0.1,0, 0, 200, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 27000, 26, enemyListSize,0.1,0, 0, 300, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 27500, 27, enemyListSize,0.1,0, 0, 100, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 28000, 28, enemyListSize,0.1,0, 0, 450, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 29000, 29, enemyListSize,0.1,0, 0, 300, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 30000, 30, enemyListSize,0.1,0, 0, 100, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 31000, 31, enemyListSize,0.1,0, 0, 200, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 31500, 32, enemyListSize,0.1,0, 0, 100, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySphere(), currentTime, startTime, 39000, 33, enemyListSize,0.1,0, 0, 50, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySphere(), currentTime, startTime, 39000, 34, enemyListSize,0.1,0, 0, 350, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 40000, 35, enemyListSize,0.1,0, 0, 400, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 40000, 36, enemyListSize,0.1,0, 0, 100, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 42000, 37, enemyListSize,0.1,0, 0, 200, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 42000, 38, enemyListSize,0.1,0, 0, 300, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 43000, 39, enemyListSize,0.1,0, 0, 500, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 43000, 40, enemyListSize,0.1,0, 0, 250, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 46000, 41, enemyListSize,0.1,0, 0, 350, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 46000, 42, enemyListSize,0.1,0, 0, 50, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 47000, 43, enemyListSize,0.1,0, 0, 200, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 47000, 44, enemyListSize,0.1,0, 0, 300, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 49000, 45, enemyListSize,0.1,0, 0, 450, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 49000, 46, enemyListSize,0.1,0, 0, 300, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 50000, 47, enemyListSize,0.1,0, 0, 350, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 50500, 48, enemyListSize,0.1,0, 0, 250, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 51000, 49, enemyListSize,0.1,0, 0, 500, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 51500, 50, enemyListSize,0.1,0, 0, 400, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 52000, 51, enemyListSize,0.1,0, 0, 500, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 53000, 52, enemyListSize,0.1,0, 0, 350, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 53500, 53, enemyListSize,0.1,0, 0, 50, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 54500, 54, enemyListSize,0.1,0, 0, 100, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 55000, 55, enemyListSize,0.1,0, 0, 200, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 55500, 56, enemyListSize,0.1,0, 0, 300, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 56000, 57, enemyListSize,0.1,0, 0, 200, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 57000, 58, enemyListSize,0.1,0, 0, 300, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 57500, 59, enemyListSize,0.1,0, 0, 100, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 58000, 60, enemyListSize,0.1,0, 0, 450, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 58500, 61, enemyListSize,0.1,0, 0, 300, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 59000, 62, enemyListSize,0.1,0, 0, 100, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 59500, 63, enemyListSize,0.1,0, 0, 200, s);
         if (currentShip !=null) {return currentShip;}
         currentShip = placeShip(new EnemySpider(), currentTime, startTime, 60000, 64, enemyListSize,0.1,0, 0, 100, s);
         if (currentShip !=null) {return currentShip;}
      }
      return null;
   }
   public EnemyShip placeShip(EnemyShip es, long currentTime, long startTime, int placeTime, int count,int enemyListSize,double vx, double vy, 
         int widthMod, int heightMod, ScreenManager s){
      if (currentTime - startTime  >= placeTime && enemyListSize+1 ==count) {
         es.setVelocityX((float)(-vx));
         es.setVelocityY((float)(vy) );
         es.setX(s.getWidth() + widthMod);
         es.setY(heightMod);
         return es;
      }
      return null;
   }
}