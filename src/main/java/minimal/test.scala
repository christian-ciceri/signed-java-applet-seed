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