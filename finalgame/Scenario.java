/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalgame;


public class Scenario {
    public static void Scenario1() throws InterruptedException{
        int i;
        String npc;
        String player;
        String narration;
        String[] anpc;
        String[] aplayer;
        Player players=new Player();
        
        player="*gasping for breath Thank you... thank you so much. I thought I was a goner back there.";
        aplayer=player.split(" ");
        System.out.print(players.user.getName()+": ");
        for(i=0;i<aplayer.length;i++){
            System.out.print(aplayer[i]+" ");
            Thread.sleep(250);
        }
        
        npc=" No problem at all. Just glad I could help. What happened to you? Those things seemed to be after you specifically.";
        anpc=npc.split(" ");
        System.out.print("\nSavior: ");
        for(i=0;i<anpc.length;i++){
            System.out.print(anpc[i]+" ");
            Thread.sleep(250);
        }
        
        player="It's... it's a long story. But I remember glimpses of another life, another time. I don't understand it all myself. But those creatures... they were like something out of a nightmare.";
        aplayer=player.split(" ");
        System.out.print("\n"+players.user.getName()+": ");
        for(i=0;i<aplayer.length;i++){
            System.out.print(aplayer[i]+" ");
            Thread.sleep(250);
        }
        
        npc="Well, whatever they were, they won't bother you anymore. You're safe now.";
        anpc=npc.split(" ");
        System.out.print("\nSavior: ");
        for(i=0;i<anpc.length;i++){
            System.out.print(anpc[i]+" ");
            Thread.sleep(250);
        }
        
        player="I hope so. It's just... unsettling, you know? To feel like I'm being hunted across lifetimes.";
        aplayer=player.split(" ");
        System.out.print("\n"+players.user.getName()+": ");
        for(i=0;i<aplayer.length;i++){
            System.out.print(aplayer[i]+" ");
            Thread.sleep(250);
        }
        
        npc="I can't imagine. But you're not alone. I'll make sure you stay safe.";
        anpc=npc.split(" ");
        System.out.print("\nSavior: ");
        for(i=0;i<anpc.length;i++){
            System.out.print(anpc[i]+" ");
            Thread.sleep(250);
        }
        
        player="Thank you. Truly. I don't know what I'd do without you.";
        aplayer=player.split(" ");
        System.out.print("\n"+players.user.getName()+": ");
        for(i=0;i<aplayer.length;i++){
            System.out.print(aplayer[i]+" ");
            Thread.sleep(250);
        }
        
        npc="Hey, we're in this together now. But speaking of which, we should probably keep moving. It's not safe to linger out here.";
        anpc=npc.split(" ");
        System.out.print("\nSavior: ");
        for(i=0;i<anpc.length;i++){
            System.out.print(anpc[i]+" ");
            Thread.sleep(250);
        }

        player="Agreed. Let's find somewhere to rest for the night. I'll tell you more about what I remember along the way.";
        aplayer=player.split(" ");
        System.out.print("\n"+players.user.getName()+": ");
        for(i=0;i<aplayer.length;i++){
            System.out.print(aplayer[i]+" ");
            Thread.sleep(250);
        }
        
        npc="Sounds like a plan.";
        anpc=npc.split(" ");
        System.out.print("\nSavior: ");
        for(i=0;i<anpc.length;i++){
            System.out.print(anpc[i]+" ");
            Thread.sleep(250);
        }
        
        narration="\nAs they start to move, a low growl echoes through the darkness, and a pair of glowing eyes appear just beyond the edge of their torchlight.";
        System.out.println(narration);
        Thread.sleep(230);
        
        player="Uh... did you hear that?";
        aplayer=player.split(" ");
        System.out.print("\n"+players.user.getName()+": ");
        for(i=0;i<aplayer.length;i++){
            System.out.print(aplayer[i]+" ");
            Thread.sleep(250);
        }
        
        npc="Yeah... I think we might have some unwelcome company. Get ready. We're not out of the woods yet.\n";
        anpc=npc.split(" ");
        System.out.print("\nSavior: ");
        for(i=0;i<anpc.length;i++){
            System.out.print(anpc[i]+" ");
            Thread.sleep(250);
        }   
        Battle.battle();
    }  
    public static void Scenario2() throws InterruptedException{
        int i;
        Monster mon=new Monster();
        String npc;
        String player;
        String narration;
        String[] anpc;
        String[] aplayer;
        Player players=new Player();
        
        narration="a scroll was inside the "+mon.enemy.getEnemy()+" satchel";
        System.out.println(narration);
        Thread.sleep(250);
        
        player="Huh!? what's this?";
        aplayer=player.split(" ");
        System.out.print("\n"+players.user.getName()+": ");
        for(i=0;i<aplayer.length;i++){
            System.out.print(aplayer[i]+" ");
            Thread.sleep(250);
        }
        narration="The scroll that "+players.user.getName()+" picked up contains a riddle on to how to navigate the forest";
        System.out.println(narration);
        Thread.sleep(250);
        
        
        Riddle riddle=new Riddle();
        riddle.gettingRiddles("bat");
        
        narration=players.user.getName()+" proceeds with on its way following the riddle";
        System.out.println(narration);
        Thread.sleep(250);
        Scenario.Scenario3();
        
    }
    public static void Scenario3() throws InterruptedException{
        //following a path then having a conversation about this world then found another with a warning that a monster would spawn if they got it wrong 
        int i;
        Monster mon=new Monster();
        String npc;
        String player;
        String narration;
        String[] anpc;
        String[] aplayer;
        Player players=new Player();
        
        narration="While following the directions from the scroll"+players.user.getName()+" Started a conversation with its savior on what the name of this world and what secrets it hold";
        System.out.println(narration);
        Thread.sleep(250);
        
        player="I've been really curios of where we are for a while now, it's cuase it seems that we're going in circles because of how the trees are the same.";
        aplayer=player.split(" ");
        System.out.print("\n"+players.user.getName()+": ");
        for(i=0;i<aplayer.length;i++){
            System.out.print(aplayer[i]+" ");
            Thread.sleep(250);
        }
        npc="It's because the trees are of the same species, and because this part of this forest is specifically vast it will be a while for us to see another species of tres";
        anpc=npc.split(" ");
        System.out.print("\nSavior: ");
        for(i=0;i<anpc.length;i++){
            System.out.print(anpc[i]+" ");
            Thread.sleep(250);
        }
        narration="As they followed the path a bush of some sort is blocking its way";
        System.out.println(narration);
        Thread.sleep(250);
        
        player="Huh? there seems to be a great wall of bushes blocking the path.";
        aplayer=player.split(" ");
        System.out.print("\n"+players.user.getName()+": ");
        for(i=0;i<aplayer.length;i++){
            System.out.print(aplayer[i]+" ");
            Thread.sleep(250);
        }
        npc="Hmmm... according to the scroll, this should be the path...";
        anpc=npc.split(" ");
        System.out.print("\nSavior: ");
        for(i=0;i<anpc.length;i++){
            System.out.print(anpc[i]+" ");
            Thread.sleep(250);
        }
        player="Savior, look at the sign";
        aplayer=player.split(" ");
        System.out.print("\n"+players.user.getName()+": ");
        for(i=0;i<aplayer.length;i++){
            System.out.print(aplayer[i]+" ");
            Thread.sleep(250);
        }
        narration="Answer my riddle for a guaranteed safe passage\n Once you're ready just shout (I'm Ready!)";
        System.out.println(narration);
        Thread.sleep(250);
        
        player="Hmmm... I guess this is the only way... I'M READY!!";
        aplayer=player.split(" ");
        System.out.print("\n"+players.user.getName()+": ");
        for(i=0;i<aplayer.length;i++){
            System.out.print(aplayer[i]+" ");
            Thread.sleep(250);
        }
        npc="Wait what are you doing? you shouldn't be hasty";
        anpc=npc.split(" ");
        System.out.print("\nSavior: ");
        for(i=0;i<anpc.length;i++){
            System.out.print(anpc[i]+" ");
            Thread.sleep(250);
        }
        narration="\nMagical floating words appeared out of nowhere";
        System.out.println(narration);
        Thread.sleep(250);
        
        Riddle riddle=new Riddle();
        riddle.gettingRiddles("bat");
        
        narration=players.user.getName()+" Answered correctly you may proceed...";
        System.out.println(narration);
        Thread.sleep(250);
        
        Scenario.Scenario4();
    }
    public static void Scenario4() throws InterruptedException{
        //survived the riddle but a path shows that leads to a wise tree but getting the riddle wrong leads to death
        int i;
        String npc1;
        String npc2;
        String player;
        String narration;
        String[] anpc;
        String[] aplayer;
        Player players=new Player();
        
        narration="As the duo followed the path that the great bush has opened they're greeted by a deep void and the end of the path form thee great bush";
        System.out.println(narration);
        Thread.sleep(250);
        
        npc2="Hello, otherworlder";
        anpc=npc2.split(" ");
        System.out.print("\nWise tree: ");
        for(i=0;i<anpc.length;i++){
            System.out.print(anpc[i]+" ");
            Thread.sleep(250);
        }
        player="Huh? who said that? show yourself";
        aplayer=player.split(" ");
        System.out.print("\n"+players.user.getName()+": ");
        for(i=0;i<aplayer.length;i++){
            System.out.print(aplayer[i]+" ");
            Thread.sleep(250);
        }
        npc1="Shhhh... shut your mouth, Hello elder, how have you been?";
        anpc=npc1.split(" ");
        System.out.print("\nSavior: ");
        for(i=0;i<anpc.length;i++){
            System.out.print(anpc[i]+" ");
            Thread.sleep(250);
        }
        narration=players.user.getName()+"Was confused as to who his savior was talking to";
        System.out.println(narration);
        Thread.sleep(250);
        
        npc2="Why, if it isn't sal, How have you been sal?";
        anpc=npc2.split(" ");
        System.out.print("\nWise tree: ");
        for(i=0;i<anpc.length;i++){
            System.out.print(anpc[i]+" ");
            Thread.sleep(250);
        }
        npc1="Im doing quite fine, elder";
        anpc=npc1.split(" ");
        System.out.print("\nSavior: ");
        for(i=0;i<anpc.length;i++){
            System.out.print(anpc[i]+" ");
            Thread.sleep(250);
        }
        narration=players.user.getName()+" Is gobsmacked as he saw the a face from the tree";
        System.out.println(narration);
        Thread.sleep(250);
        
        npc1="Im really sorry for being in a hurry elder, but can you help us find the way out of the forest?";
        anpc=npc1.split(" ");
        System.out.print("\nSavior: ");
        for(i=0;i<anpc.length;i++){
            System.out.print(anpc[i]+" ");
            Thread.sleep(250);
        }
        player="(Still shook) Hey savior why does the tree have a face and its talking as well?";
        aplayer=player.split(" ");
        System.out.print("\n"+players.user.getName()+": ");
        for(i=0;i<aplayer.length;i++){
            System.out.print(aplayer[i]+" ");
            Thread.sleep(250);
        }
        npc1="Hey"+players.user.getName()+" be respectful to the elder, the wise tree";
        anpc=npc1.split(" ");
        System.out.print("\nSavior: ");
        for(i=0;i<anpc.length;i++){
            System.out.print(anpc[i]+" ");
            Thread.sleep(250);
        }
        narration=players.user.getName()+" remembered what the wise tree is";
        System.out.println(narration);
        Thread.sleep(250);
        
        narration="A wise tree is a century old tree with a spirit and knowledge of a sage";
        System.out.println(narration);
        Thread.sleep(250);
        
        npc2="Your friend there is quite a funny fellow";
        anpc=npc2.split(" ");
        System.out.print("\nWise tree: ");
        for(i=0;i<anpc.length;i++){
            System.out.print(anpc[i]+" ");
            Thread.sleep(250);
        }
        npc1="Im sorry about the rudeness elder, otherworlder as you already know is are quite rude";
        anpc=npc1.split(" ");
        System.out.print("\nSavior: ");
        for(i=0;i<anpc.length;i++){
            System.out.print(anpc[i]+" ");
            Thread.sleep(250);
        }
        npc2="ho ho ho, it's fine, it's fine.";
        anpc=npc2.split(" ");
        System.out.print("\nWise tree: ");
        for(i=0;i<anpc.length;i++){
            System.out.print(anpc[i]+" ");
            Thread.sleep(250);
        }
        npc1="hehe(laughs awkwardly) uhmm... elder, about the question i asked you";
        anpc=npc1.split(" ");
        System.out.print("\nSavior: ");
        for(i=0;i<anpc.length;i++){
            System.out.print(anpc[i]+" ");
            Thread.sleep(250);
        }
        npc2="Yes, but you know that i have to ask a riddle";
        anpc=npc2.split(" ");
        System.out.print("\nWise tree: ");
        for(i=0;i<anpc.length;i++){
            System.out.print(anpc[i]+" ");
            Thread.sleep(250);
        }
        npc1="Ahhh... that brain-curling riddles of yours again";
        anpc=npc1.split(" ");
        System.out.print("\nSavior: ");
        for(i=0;i<anpc.length;i++){
            System.out.print(anpc[i]+" ");
            Thread.sleep(250);
        }
        npc2="are you ready for it?";
        anpc=npc2.split(" ");
        System.out.print("\nWise tree: ");
        for(i=0;i<anpc.length;i++){
            System.out.print(anpc[i]+" ");
            Thread.sleep(250);
        }
        npc1="Do we even have a coice?";
        anpc=npc1.split(" ");
        System.out.print("\nSavior: ");
        for(i=0;i<anpc.length;i++){
            System.out.print(anpc[i]+" ");
            Thread.sleep(250);
        }
        npc2="I'm affraid not";
        anpc=npc2.split(" ");
        System.out.print("\nWise tree: ");
        for(i=0;i<anpc.length;i++){
            System.out.print(anpc[i]+" ");
            Thread.sleep(250);
        }
        Riddle riddle=new Riddle();
        riddle.gettingRiddles("tree");
    }
    public static void Scenario5() throws InterruptedException{
        //survived the riddle and the wise tree showed a path that could possibly leads to the exit of the forest
        int i;
        String npc1;
        String npc2;
        String player;
        String narration;
        String[] anpc;
        String[] aplayer;
        Player players=new Player();
        
        narration="Getting the correct answer, the wise tree provided the duo with the knowledge of how to get to the end of the forest";
        System.out.println(narration);
        Thread.sleep(250);
        
        narration="Threading towards the end of the forest, they talked and asked and answered each others questions";
        System.out.println(narration);
        Thread.sleep(250);
        
        narration="As they pressed forward to the path, they reached the huge stone that the wise tree has told them";
        System.out.println(narration);
        Thread.sleep(250);
        
        Scenario.Scenario6();
        
    }
    public static void Scenario6() throws InterruptedException{
        //encoutered a snake like monster and if they surivived they might leave the forest
        int i;
        String npc1;
        String npc2;
        String player;
        String narration;
        String[] anpc;
        String[] aplayer;
        Player players=new Player();
        
        narration="Following the world trees directions mists starts to envelpoe the forest";
        System.out.println(narration);
        Thread.sleep(250);
        
        narration="A sudden cold breeze can be felt as the mist enveloping the forest gets thicker";
        System.out.println(narration);
        Thread.sleep(250);
        
        player="Uhmm... Savior, Has it always been this cold here?";
        aplayer=player.split(" ");
        System.out.print("\n"+players.user.getName()+": ");
        for(i=0;i<aplayer.length;i++){
            System.out.print(aplayer[i]+" ");
            Thread.sleep(250);
        }
        npc1="Its usually a bit chilly but, today its especially cold.. brrrrr";
        anpc=npc1.split(" ");
        System.out.print("\nSavior: ");
        for(i=0;i<anpc.length;i++){
            System.out.print(anpc[i]+" ");
            Thread.sleep(250);
        }
        narration="As they go further to the path that the wise tree has advised a slithering sound can be heard";
        System.out.println(narration);
        Thread.sleep(250);
        
        player="Wait, savior... Did you hear that?";
        aplayer=player.split(" ");
        System.out.print("\n"+players.user.getName()+": ");
        for(i=0;i<aplayer.length;i++){
            System.out.print(aplayer[i]+" ");
            Thread.sleep(250);
        }
        npc1="I sure did..";
        anpc=npc1.split(" ");
        System.out.print("\nSavior: ");
        for(i=0;i<anpc.length;i++){
            System.out.print(anpc[i]+" ");
            Thread.sleep(250);
        }
        narration="the two of them felt blood lust from an unkown being";
        System.out.println(narration);
        Thread.sleep(250);
        
        npc2="It seems i have an un-invited guestsssss";
        anpc=npc2.split(" ");
        System.out.print("\nSavior: ");
        for(i=0;i<anpc.length;i++){
            System.out.print(anpc[i]+" ");
            Thread.sleep(250);
        }
        narration="the unkown being that has been emitting blood lust has shown itself infront of them";
        System.out.println(narration);
        Thread.sleep(250);
        
        npc2="For thousands of years that i've lived in this forest this is the first time anybody just wandered aimlessly inyo my territory";
        anpc=npc2.split(" ");
        System.out.print("\nSavior: ");
        for(i=0;i<anpc.length;i++){
            System.out.print(anpc[i]+" ");
            Thread.sleep(250);
        }
        player="W-w-we're very sorry for entering your territory without any invitation";
        aplayer=player.split(" ");
        System.out.print("\n"+players.user.getName()+": ");
        for(i=0;i<aplayer.length;i++){
            System.out.print(aplayer[i]+" ");
            Thread.sleep(250);
        }
        npc2="Hmmmm... why did you come here?";
        anpc=npc2.split(" ");
        System.out.print("\nSavior: ");
        for(i=0;i<anpc.length;i++){
            System.out.print(anpc[i]+" ");
            Thread.sleep(250);
        }
        narration="A serpent appeard with the voice of the terrifying being with eyes that are petrifying";
        System.out.println(narration);
        Thread.sleep(250);
        
        npc1="We're very sorry for the sudden intrution O'great serpent, we must've made a wrong turn";
        anpc=npc1.split(" ");
        System.out.print("\nSavior: ");
        for(i=0;i<anpc.length;i++){
            System.out.print(anpc[i]+" ");
            Thread.sleep(250);
        }
        player="We were just following the wise trees directions";
        aplayer=player.split(" ");
        System.out.print("\n"+players.user.getName()+": ");
        for(i=0;i<aplayer.length;i++){
            System.out.print(aplayer[i]+" ");
            Thread.sleep(250);
        }
        npc2="Are you saying that you where directed by that old tree?";
        anpc=npc2.split(" ");
        System.out.print("\nSavior: ");
        for(i=0;i<anpc.length;i++){
            System.out.print(anpc[i]+" ");
            Thread.sleep(250);
        }
        npc1="That is correct O'great serpent";
        anpc=npc1.split(" ");
        System.out.print("\nSavior: ");
        for(i=0;i<anpc.length;i++){
            System.out.print(anpc[i]+" ");
            Thread.sleep(250);
        }
        npc2="Hmmm.. if what you're saying is true then that peron right there must be not from this land";
        anpc=npc2.split(" ");
        System.out.print("\nSavior: ");
        for(i=0;i<anpc.length;i++){
            System.out.print(anpc[i]+" ");
            Thread.sleep(250);
        }
        player="O'great serpent, im sorry to interupt you but, how did you know im not from this world?";
        aplayer=player.split(" ");
        System.out.print("\n"+players.user.getName()+": ");
        for(i=0;i<aplayer.length;i++){
            System.out.print(aplayer[i]+" ");
            Thread.sleep(250);
        }
        npc2="Hmmmm... i guess that old tree hasn't told you huh? but, i dont have any obligation to tell you anything\nSo why dont you scram, i dont take tresspasersss kidly";
        anpc=npc2.split(" ");
        System.out.print("\nSavior: ");
        for(i=0;i<anpc.length;i++){
            System.out.print(anpc[i]+" ");
            Thread.sleep(250);
        }
        narration="As sweat drops down on their faces, they quickly sprinted out of the serpents territory\nThey ran and ran without turning back and without them realizing they're at the end of the forest";
        System.out.println(narration);
        Thread.sleep(250);
        
        narration="The sun raises hit there faces";
        System.out.println(narration);
        Thread.sleep(250);
        
        narration="With a sigh of relief they walked to where the sun raise hit there faces and was greeted with a beautiful sight of the sun set";
        System.out.println(narration);
        Thread.sleep(250);
        
        player="We-we're out of the forest? but how?";
        aplayer=player.split(" ");
        System.out.print("\n"+players.user.getName()+": ");
        for(i=0;i<aplayer.length;i++){
            System.out.print(aplayer[i]+" ");
            Thread.sleep(250);
        }
        npc1="The mist was too thick i didn't realize we where going at the direction guided by the wise tree";
        anpc=npc1.split(" ");
        System.out.print("\nSavior: ");
        for(i=0;i<anpc.length;i++){
            System.out.print(anpc[i]+" ");
            Thread.sleep(250);
        }
        player="Are you sure it was the mists fault or you where just scared?";
        aplayer=player.split(" ");
        System.out.print("\n"+players.user.getName()+": ");
        for(i=0;i<aplayer.length;i++){
            System.out.print(aplayer[i]+" ");
            Thread.sleep(250);
        }
        npc1="Ohh come on you where scared too, that was my first time seeing the great serpent personaly";
        anpc=npc1.split(" ");
        System.out.print("\nSavior: ");
        for(i=0;i<anpc.length;i++){
            System.out.print(anpc[i]+" ");
            Thread.sleep(250);
        }
        player="I didnt know snakes can talk?";
        aplayer=player.split(" ");
        System.out.print("\n"+players.user.getName()+": ");
        for(i=0;i<aplayer.length;i++){
            System.out.print(aplayer[i]+" ");
            Thread.sleep(250);
        }
        narration="As they talked while walking to there next destination, their voice faided into the distance";
        System.out.println(narration);
        Thread.sleep(250);
        
        System.out.println("-------------END OF CHAPTER I---------------------");
    }
   }

    