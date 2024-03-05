package etc.generic.basic;

public class Box<T> {  // 제네릭 클래스로 선언. 타입을 다 받는다 하지만 Box로 객체를만들때 타입을 직접 써줘라

    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
