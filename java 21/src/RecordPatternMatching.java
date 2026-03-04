record User(String firstName, String lastName){}

private void  withOldApproach(Object obj){
    if(obj instanceof User u){
        System.out.println(STR."With Old way: First Name : \{u.firstName}, Last Name: \{u.lastName}");
    }
}

private void withNewApproach(Object obj){
    if(obj instanceof User(String firstName, String lastName)){
        System.out.println(STR."With new way: First Name : \{firstName}, Last Name: \{lastName}");
    }
}

private void withSwicthPatternMatching(Object obj){

    switch (obj){
        case String s -> System.out.println("String");
        case User(String firstName, String _) -> System.out.println(STR."User : Name : \{firstName}");
        default -> System.out.println("default");
    }
}

void main(){
    User u = new User("Nilesh", "kadam");
    withOldApproach(u);
    withNewApproach(u);
    withSwicthPatternMatching(u);
    withSwicthPatternMatching("Test");
}

