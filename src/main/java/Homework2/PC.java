package Homework2;

public class PC {

        private Monitor samsung;
        private Motherboard motherboard;
        private Case myCase;


        public PC(Monitor samsung, Motherboard motherboard, Case myCase) {
            this.samsung = samsung;
            this.motherboard = motherboard;
            this.myCase = myCase;
        }

        public Monitor getSamsung() {
            return samsung;
        }

        public void setSamsung(Monitor samsung) {
            this.samsung = samsung;
        }

        public Motherboard getMotherboard() {
            return motherboard;
        }

        public void setMotherboard(Motherboard motherboard) {
            this.motherboard = motherboard;
        }

        public Case getMyCase() {
            return myCase;
        }

        public void setMyCase(Case myCase) {
            this.myCase = myCase;
        }


        @Override
        public String toString() {
            return "PC{" + "Monitor: " + samsung + ", motherboard: " + motherboard + ", Case= " + myCase + '}';
        }

        private void drawLogo(){
            samsung.drawPixel(2,4,"black");

        }

        public void description(){
            System.out.println("Welcome to worst buy. Below is the description of the pc on sale today\n"+ samsung + "\n"+motherboard + "\n"+myCase);

        }


        public void powerUp(){
            myCase.pressPowerButton();
            drawLogo();
            motherboard.loadProgram("Photoshop");

    }


}
