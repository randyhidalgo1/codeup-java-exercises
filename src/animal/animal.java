package animal;

public class animal {

        private String name;
        private String sound;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSound() {
            return sound;
        }

        public void setSound(String sound) {
            this.sound = sound;
        }

        public void printStats(String s) {

            System.out.printf("Murphy says RoooFF!!");
        }

        public animal() {

        }

        public void dog(String name, String sound) {
            this.name = name;
            this.sound = "RoooFF";

        }
    }

