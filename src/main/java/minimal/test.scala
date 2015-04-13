package minimal

trait Updatable
{
    def update();
}
class Generic[T  <: Updatable]
{
    def update(obj: T)
    {
        obj.update();
    }
}

class UserDAO
{

}
trait IUser
{
  def isValidated():Boolean;
}
class User
{
  def isValidated():Boolean=
  {
    true
  }
}
object User
{}
class UserService(dao: UserDAO)
{
  var dao=new UserDAO();

  def findById(userId: String): User=
  {
    val instance=new User()
    instance
  }
  def isValidated(user: User): Boolean=
  {
     user.isValidated()
  }

  val getValidated=findById _  andThen ((_ : User).isValidated)
}