package Computer1;


class ObjMass {
    static Computer[] computers = new Computer [5];

    public static void main (String[] args){
        computers[0] = new Computer("Celeron");
        computers[1] = new Computer("Atlon");
        computers[2] = new Computer("Intel");
        computers [3] = new Computer("HP");
        computers [4] = new Computer("Lenovo");

        for (int i = 0; i<5; i++){
            System.out.println(computers[i].name);
        }
    }
}

class Computer{
    String name;

    public Computer (String name){
        this.name = name;
    }
}