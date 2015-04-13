class UserDAO {
  def findById(userId: String):User=new User
}

class User() {
  def isValidated():Boolean=true
}

class UserService(dao: UserDAO) {
  //with val as well, the pure composition:
  def getValidated = dao.findById _ andThen ((_: User).isValidated)    
}

object MainClass {
  def main(args: Array[String])= {
    val us = new UserService(new UserDAO)
    println( us.getValidated("user id") )
  }
}

