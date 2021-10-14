package HomeTraining.Classes.hash_equals;

public class SomeStringify {
    private String s;

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o instanceof SomeStringify) {
//            return s.equals(((SomeStringify) o).s);
//        }
//        // нарушение симметричности, классы разного происхождения
//        if (o instanceof String) {
//            return s.equals(o);
//        }
//        return false;
//    }

    public void setS(String str) {
        this.s = str;
    }

    //Правильное определение метода equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        return o instanceof SomeStringify && ((SomeStringify) o).s.equals(s);
    }
}
