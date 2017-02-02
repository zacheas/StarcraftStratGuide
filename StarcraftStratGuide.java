/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starcraftstratguide;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Zach
 */
public class StarcraftStratGuide extends JFrame {

    /**
     * @param args the command line arguments
     */
    
    int race;
    
    JTextArea buildOrder;
    
    
    //////////////Race Buttons///////////
    //<editor-fold defaultstate="collapsed" desc="Zerg Build Buttons">
    JButton ZvP, ZvZ, ZvT, zergBuild;
    JButton pureLing;
    
    // </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Terran Build Buttons">
    
    JButton TvP, TvZ, TvT, terranBuild;
    
    JButton reaperExpo,CCFirstTank;
    // </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Protoss Build Buttons">
    
    JButton PvP, PvZ, PvT, protossBuild;    
    
    JButton nexusFirstEco, gateFEOracle, gate7AllIn, gate3Adept;
    // </editor-fold>
    
    public StarcraftStratGuide() {
        
       ////////Initialize Menu/////// 
       //<editor-fold defaultstate="collapsed" desc="Initalize menu contents">
        
        setLayout(new FlowLayout());

        buildOrder = new JTextArea("");
        add(buildOrder);
         
        protossBuild = new JButton("Protoss Builds");
        add(protossBuild);
        
        zergBuild = new JButton("Zerg Builds");
        add(zergBuild);
        
        terranBuild = new JButton("Terran Builds");
        add(terranBuild);
       // </editor-fold>
       
       ////////Builds//////  
        //<editor-fold defaultstate="collapsed" desc="Terran Builds">
        
        //<editor-fold defaultstate="collapsed" desc="Terran Opponent Buttons">
        TvP = new JButton("TvP");
        add(TvP);
        TvP.setVisible(false);
        
        TvZ = new JButton("TvZ");
        add(TvZ);
        TvZ.setVisible(false);
        
        TvT = new JButton("TvT");
        add(TvT);
        TvT.setVisible(false);
        // </editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="Terran Build Buttons">
        reaperExpo = new JButton("Reaper FE");
        add(reaperExpo);
        reaperExpo.setVisible(false);
        
        CCFirstTank = new JButton("CC First Tank Drop");
        add(CCFirstTank);
        CCFirstTank.setVisible(false);
        // </editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="Terran All Build event listeners">
        reaperBuild reapExpo = new reaperBuild();
        reaperExpo.addActionListener(reapExpo);
        
        CCTankDrop CCFirstDrop = new CCTankDrop();
        CCFirstTank.addActionListener(CCFirstDrop);
        // </editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="TvP Event Listeners">
        terranVsProtoss tvpBuilds = new terranVsProtoss();
        TvP.addActionListener(tvpBuilds);
        // </editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="TvZ Event Listeners">
        terranVsZerg tvzBuilds = new terranVsZerg();
        TvZ.addActionListener(tvzBuilds);
        // </editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="TvT Event Listeners">
        terranVsTerran tvtBuilds = new terranVsTerran();
        TvT.addActionListener(tvtBuilds);
        // </editor-fold>
        
        // </editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="Zerg Builds">
        //<editor-fold defaultstate="collapsed" desc="Zerg Opponent Buttons">
        ZvP = new JButton("ZvP");
        add(ZvP);
        ZvP.setVisible(false);
        
        ZvZ = new JButton("ZvZ");
        add(ZvZ);
        ZvZ.setVisible(false);
        
        ZvT = new JButton("ZvT");
        add(ZvT);
        ZvT.setVisible(false);
        // </editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="Zerg Build Buttons">
        pureLing = new JButton("Basic Pure Zergling");
        add(pureLing);
        pureLing.setVisible(false);
        
        // </editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="ZvP Event Listeners">
        zergVsProtoss zvpBuilds = new zergVsProtoss();
        ZvP.addActionListener(zvpBuilds);
        // </editor-fold>

        //<editor-fold defaultstate="collapsed" desc="ZvZ Event Listeners">
        zergVsZerg zvzBuilds = new zergVsZerg();
        ZvZ.addActionListener(zvzBuilds);
        // </editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="ZvT Event Listeners">
        zergVsTerran zvtBuilds = new zergVsTerran();
        ZvT.addActionListener(zvtBuilds);
        // </editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="Zerg Build Event Listeners">
        basicZerg zergling = new basicZerg();
        pureLing.addActionListener(zergling);
        
        // </editor-fold>
        // </editor-fold>
       
        //<editor-fold defaultstate="collapsed" desc="Protoss Builds">
        //<editor-fold defaultstate="collapsed" desc="Protoss Opponent Buttons">
        PvP = new JButton("PvP");
        add(PvP);
        PvP.setVisible(false);
        
        PvZ = new JButton("PvZ");
        add(PvZ);
        PvZ.setVisible(false);
        
        PvT = new JButton("PvT");
        add(PvT);
        PvT.setVisible(false);
        // </editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="Protoss Build Buttons">
        nexusFirstEco = new JButton("Nexus First Eco");
        add(nexusFirstEco);
        nexusFirstEco.setVisible(false);
        
        gateFEOracle = new JButton("3-5 Gate FE Oracle");
        add(gateFEOracle);
        gateFEOracle.setVisible(false);
        
        gate7AllIn = new JButton("7 Gate All In");
        add(gate7AllIn);
        gate7AllIn.setVisible(false);
        
        gate3Adept = new JButton("3 Gate Adept All In");
        add(gate3Adept);
        gate3Adept.setVisible(false);
        // </editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="Protoss All Build event listeners">     
        nexusFirstBuild nexusEco = new nexusFirstBuild();
        nexusFirstEco.addActionListener(nexusEco);
        
        gateFEOracleECO OracleFE = new gateFEOracleECO();
        gateFEOracle.addActionListener(OracleFE);
        
        gate7 gateAllIn = new gate7();
        gate7AllIn.addActionListener(gateAllIn);
        
        adept3Gate adeptAllIn = new adept3Gate();
        gate3Adept.addActionListener(adeptAllIn);
        // </editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="PvP Event Listeners">
        protossVsProtoss pvpBuilds = new protossVsProtoss();
        PvP.addActionListener(pvpBuilds);

        // </editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="PvZ Event Listeners">
        protossVsZerg pvzBuilds = new protossVsZerg();
        PvZ.addActionListener(pvzBuilds);

        // </editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="PvT Event Listeners">
        protossVsTerran pvtBuilds = new protossVsTerran();
        PvT.addActionListener(pvtBuilds);
        // </editor-fold>
        // </editor-fold>
        
        ///////////////My Race Event Listeners//////////////  
        //<editor-fold defaultstate="collapsed" desc="Race Event Listeners">
          myRaceProtoss userProtoss = new myRaceProtoss();
          protossBuild.addActionListener(userProtoss);

          myRaceZerg userZerg = new myRaceZerg();
          zergBuild.addActionListener(userZerg);

          myRaceTerran userTerran = new myRaceTerran();
          terranBuild.addActionListener(userTerran);
          // </editor-fold>  
    }
    
    ///////////////My Race action events////////
    //<editor-fold defaultstate="collapsed" desc="My Race Action Events">
    public class myRaceProtoss implements ActionListener{
        public void actionPerformed(ActionEvent userProtoss) {
            zergBuild.setVisible(false);
            protossBuild.setVisible(false);
            terranBuild.setVisible(false);
            
            PvP.setVisible(true);
            PvZ.setVisible(true);
            PvT.setVisible(true); 
            
            race = 1;
        }
    }

    public class myRaceZerg implements ActionListener{
        public void actionPerformed(ActionEvent userZerg) {
            zergBuild.setVisible(false);
            protossBuild.setVisible(false);
            terranBuild.setVisible(false);
            
            ZvP.setVisible(true);
            ZvZ.setVisible(true);
            ZvT.setVisible(true);
            
            race = 2;
        }
    }
    
    public class myRaceTerran implements ActionListener{
        public void actionPerformed(ActionEvent userTerran) {
            
            zergBuild.setVisible(false);
            protossBuild.setVisible(false);
            terranBuild.setVisible(false);
            
            TvP.setVisible(true);
            TvZ.setVisible(true);
            TvT.setVisible(true);
            
            race = 3;  
        }
    }
    // </editor-fold>
     
    ////////////Race action events//////////////
    //<editor-fold defaultstate="collapsed" desc="Terran Action Events">
    
    //<editor-fold defaultstate="collapsed" desc="TvP Action Events">
    public class terranVsProtoss implements ActionListener{
        public void actionPerformed(ActionEvent tvpBuilds) {
            TvP.setVisible(false);
            TvZ.setVisible(false);
            TvT.setVisible(false);
            
            reaperExpo.setVisible(true);
        }
    }
    
    // </editor-fold> 
    
    //<editor-fold defaultstate="collapsed" desc="TvZ Action Events">
    public class terranVsZerg implements ActionListener{
        public void actionPerformed(ActionEvent tvzBuilds) {
            TvP.setVisible(false);
            TvZ.setVisible(false);
            TvT.setVisible(false);
            
            reaperExpo.setVisible(true);
            CCFirstTank.setVisible(true);
        }
    }
    
    // </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="TvT Action Events">
    public class terranVsTerran implements ActionListener{
        public void actionPerformed(ActionEvent tvtBuilds) {
            TvP.setVisible(false);
            TvZ.setVisible(false);
            TvT.setVisible(false);
            
            reaperExpo.setVisible(true);
        }
    }
    
    // </editor-fold> 
    
    //<editor-fold defaultstate="collapsed" desc="Terran Builds">
    
    //<editor-fold defaultstate="collapsed" desc="Reaper Expo Action Events">
    public class reaperBuild implements ActionListener{
        public void actionPerformed(ActionEvent reapExpo) {
            reaperExpo.setVisible(false);
            CCFirstTank.setVisible(false);
            buildOrder.setText(""+
    "                                         Reaper Fast Expand \n"+
    "\n"+
    "  Supply                      Time                   *Build*         \n" +
    "  14       	        0:17            	      Supply Depot	  \n" +
    "  16       	        0:41            	      Barracks	  \n" +
    "  16       	        0:44            	      Refinery	  \n" +
    "  19       	        1:29           	      Orbital Command \n" +
    "  19       	        1:30           	      Reaper	  \n" +
    "  20       	        1:40           	      Command Center   \n"+
    "\n"+
    "         http://lotv.spawningtool.com/build/6657/");
            
            zergBuild.setVisible(true);
            protossBuild.setVisible(true);
            terranBuild.setVisible(true);
            
        }
    }
    
    // </editor-fold> 
    
    //<editor-fold defaultstate="collapsed" desc="CC First Tank Drop">
    public class CCTankDrop implements ActionListener{
        public void actionPerformed(ActionEvent CCFirstDrop) {
            reaperExpo.setVisible(false);
            CCFirstTank.setVisible(false);
            buildOrder.setText(""+
"                                   CC First Tank Drop \n"+
"\n"+
"  14	  	  Supply Depot	  \n" +
"  17	  0:59	  Command Center	  \n" +
"  18	  	  Barracks	  \n" +
"  19	  	  Refinery x2	  \n" +
"  22	  	  Marine	  \n" +
"  23	  	  Bunker	  \n" +
"  23	  	  Barracks Reactor, Orbital Command x2	  \n" +
"  23	  	  Supply Depot	  \n" +
"  23	  2:26	  Factory, Supply Depot	  \n" +
"  30	  	  Factory Tech Lab	  \n" +
"  	  	  Starport	  @100 gas\n" +
"  27	  	  Medivac, Marine x2	  when starport finishes, 2x marine\n" +
"  	  	  Factory Reactor	  Reactor 2 on Factory 1\n" +
"  	  4:02	  Command Center	  @400 mins\n" +
"  	  	  Barracks x2	  @300 mins barracks 2 and 3\n" +
"  	  4:20	  Stimpack	  \n" +
"  	  	  Refinery x2	  \n" +
"  	  4:47	  Engineering Bay x2	  @250 mins\n" +
"  	  	  Terran Infantry Weapons Level 1	  \n" +
"  	  	  Terran Infantry Armor Level 1\n"+
"\n"+
"                       http://lotv.spawningtool.com/build/7866/");
            
            zergBuild.setVisible(true);
            protossBuild.setVisible(true);
            terranBuild.setVisible(true);
            
        }
    }
    // </editor-fold>
    
    // </editor-fold> 
    
    // </editor-fold> 

    //<editor-fold defaultstate="collapsed" desc="Protoss Action Events">
    
    //<editor-fold defaultstate="collapsed" desc="PvP Action Events">
    public class protossVsProtoss implements ActionListener{
        public void actionPerformed(ActionEvent pvpBuilds) {
            PvP.setVisible(false);
            PvZ.setVisible(false);
            PvT.setVisible(false);
            
            nexusFirstEco.setVisible(true);
        }
    } 
    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc="PvZ Action Events">
    public class protossVsZerg implements ActionListener{
        public void actionPerformed(ActionEvent pvzBuilds) {
            PvP.setVisible(false);
            PvZ.setVisible(false);
            PvT.setVisible(false);
            
            gate7AllIn.setVisible(true);
            gate3Adept.setVisible(true);
            
        }
    } 
    // </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="PvT Action Events">
    public class protossVsTerran implements ActionListener{
        public void actionPerformed(ActionEvent pvtBuilds) {
            PvP.setVisible(false);
            PvZ.setVisible(false);
            PvT.setVisible(false);
            
            gateFEOracle.setVisible(true);
            gate3Adept.setVisible(true);
        }
    }
    // </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Protoss Builds">
    //<editor-fold defaultstate="collapsed" desc="Nexus First Open">
    public class nexusFirstBuild implements ActionListener{
        public void actionPerformed(ActionEvent nexusEco) {    
            nexusFirstEco.setVisible(false);
            gateFEOracle.setVisible(false);
            gate3Adept.setVisible(false);
            
            buildOrder.setText(""+
        "                                           Nexus First Eco \n"+
        "\n"+
        "  Supply                                               *Build*         \n"+
        "  17	  	  Nexus	  \n" +
        "  17	  	  Gateway	  \n" +
        "  18	  	  Assimilator	  \n" +
        "  19	  	  Assimilator	  \n" +
        "  20	  	  Gateway	  \n" +
        "  22	  	  Cybernetics Core	  \n" +
        "  22	  	  Pylon	  \n" +
        "  25	  	  Warp Gate	  \n" +
        "  25	  	  Adept x2\n"+
        "\n"+
        "         http://lotv.spawningtool.com/build/7782/");
            
            zergBuild.setVisible(true);
            protossBuild.setVisible(true);
            terranBuild.setVisible(true);
        }
    }
    // </editor-fold> 
    
    //<editor-fold defaultstate="collapsed" desc="1 gate Oracle FE">
    public class gateFEOracleECO implements ActionListener{
        public void actionPerformed(ActionEvent OracleFE) {    
            nexusFirstEco.setVisible(false);
            gateFEOracle.setVisible(false);
            gate3Adept.setVisible(false);
            
            buildOrder.setText(""+
    "                                               Oracle Fast Expand \n"+
        "\n"+
        "  Supply	  Time	  *Build*	  \n"+
        "  13	  0:18	  Pylon	  \n" +
        "  15	  0:37	  Gateway	  \n" +
        "  16	  0:48	  Assimilator	  \n" +
        "  17	  1:12	  Nexus	  \n" +
        "  19	  1:37	  Cybernetics Core	  \n" +
        "  19	  1:45	  Assimilator	  \n" +
        "  20	  1:51	  Pylon	  \n" +
        "  21                         2:00                    Gateway  \n"+
        "  23	  2:15	  Adept, Warp Gate      Scout with this\n" +
        "Begin producing Adepts non-stop\n"+
        "  26	  2:30	  Pylon	  \n" +
        "  27	  2:37	  Stargate\n"+
        "  29                        ****                       Gateway \n"+
        "  31                        ****                       Gateway \n"+
        "Create two Oracles, harass, then produce voidray to assist the Adepts\n"+
        "Produce extra gateways as needed for warp cycles");
            
            zergBuild.setVisible(true);
            protossBuild.setVisible(true);
            terranBuild.setVisible(true);
        }
    }
    // </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="7 gate All In">
    public class gate7 implements ActionListener{
        public void actionPerformed(ActionEvent gateAllIn) {    
            gate7AllIn.setVisible(false); 
            gate3Adept.setVisible(false);
            
            buildOrder.setText(""+
        "                                           7 Gate All In                                                         \n"+
        "\n"+
"Supply               *Build*                               \n"+
        "  14                       Pylon	  \n" +
        "  16                       Nexus	  \n" +
        "  16                       Gateway	  \n" +
        "  16                       Assimilator	  \n" +
        "  20                       Cybernetics Core	  \n" +
        "  20                       Zealot	  \n" +
        "  23                       Assimilator	  \n" +
        "  25                       Mothership Core	  \n" +
        "  25                       Warp Gate	  \n" +
        "  31                       Robotics Facility	  \n" +
        "  33                       Gateway\n"+
        "\n"+
        "         http://lotv.spawningtool.com/build/6616/");
            zergBuild.setVisible(true);
            protossBuild.setVisible(true);
            terranBuild.setVisible(true);
        }
    }
    // </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="3 gate Adept All In">
    public class adept3Gate implements ActionListener{
        public void actionPerformed(ActionEvent adeptAllIn) {    
            gate7AllIn.setVisible(false);
            gate3Adept.setVisible(false);
            nexusFirstEco.setVisible(false);
            gateFEOracle.setVisible(false);
            
            buildOrder.setText(""+
        "                                           3 Gate Adept All In \n"+
        "\n"+
        "Supply         *Build*\n" +
        "14                 pylon\n" +
        "16                 gateway\n" +
        "17                 gas x2\n" +
        "19                 pylon\n" +
        "\n" +
        "@100% gateway -> cybo\n" +
        "\n" +
        "22                 forge \n" +
        "22                 gateway\n" +
        "22                 twilight\n" +
        "\n" +
        "@100% cybo -> warpgate\n" +
        "\n" +
        "24                 Mothership Core\n" +
        "\n" +
        "@100% forge -> weapons 1\n" +
        "@100% twilight -> adept upgrade\n" +
        "\n" +
        "26                 adept x2\n" +
        "30                 gateway\n" +
        "30                 pylon\n" +
        "33                 pylon\n" +
        "35                 forward pylon\n" +
        "45                 pylon\n" +
        "\n" +
        "@100% weapons 1 -> weapons 2\n" +
        "\n" +
        "After 26 supply, build adepts and stalkers. If needed, mix zealots in. ");
            
            zergBuild.setVisible(true);
            protossBuild.setVisible(true);
            terranBuild.setVisible(true);
        }
    }
    // </editor-fold> 
    
    // </editor-fold>
    // </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Zerg Action Events">
    
    //<editor-fold defaultstate="collapsed" desc="ZvP Action Events">
    public class zergVsProtoss implements ActionListener{
        public void actionPerformed(ActionEvent zvpBuilds) {
            ZvP.setVisible(false);
            ZvZ.setVisible(false);
            ZvT.setVisible(false);
            
        }
    } 
    // </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="ZvZ Action Events">
    public class zergVsZerg implements ActionListener{
        public void actionPerformed(ActionEvent zvzBuilds) {
            ZvP.setVisible(false);
            ZvZ.setVisible(false);
            ZvT.setVisible(false);
            
            pureLing.setVisible(true);
            
        }
    } 
    // </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="ZvT Action Events">
    public class zergVsTerran implements ActionListener{
        public void actionPerformed(ActionEvent zvtBuilds) {
            ZvP.setVisible(false);
            ZvZ.setVisible(false);
            ZvT.setVisible(false);
            
        }
    } 
    // </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Zerg Builds">
    
    //<editor-fold defaultstate="collapsed" desc="Pure Zergling">
    public class basicZerg implements ActionListener{
        public void actionPerformed(ActionEvent zergling){              
            pureLing.setVisible(false);
            
            buildOrder.setText(""+
        "                                           Basic Pure Zergling \n"+
        "\n"+
        "  Supply                 Time                    *Build*\n"+
        "  13	  0:13	  Extractor	  \n" +
        "  14	  0:33	  Spawning Pool	  \n" +
        "  13	  0:42	  Extractor	  \n" +
        "  15	  0:52	  Overlord	  \n" +
        "  15	  1:21	  Metabolic Boost, Queen	  \n" +
        "  15	  1:23	  Zergling x4	  \n" +
        "  15	  1:27	  Zergling x2	  \n" +
        "  20	  1:34	  Zergling x2	  \n" +
        "  21	  1:45	  Zergling x2	  \n" +
        "  22	  2:00	  Zergling x2, Hatchery	  \n" +
        "  22	  2:07	  Overlord	  \n" +
        "  22	  2:25	  Queen	  \n" +
        "  24	  2:34	  Zergling x2	  \n" +
        "  24	  2:35	  Zergling x8	  \n" +
        "  29	  2:45	  Overlord	  \n" +
        "  29	  3:05	  Zergling x8	  \n" +
        "  30	  3:21	  Zergling x6	\n"+
        "\n"+
        "              http://lotv.spawningtool.com/build/6616/");
            
        zergBuild.setVisible(true);
        protossBuild.setVisible(true);
        terranBuild.setVisible(true);
        }
    }
    // </editor-fold>
    
    // </editor-fold>
    // </editor-fold>
    
    public static void main(String[] args) {
        // TODO code application logic here
        StarcraftStratGuide gui = new StarcraftStratGuide();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(410,675);
        gui.setVisible(true);
        gui.setTitle("Starcraft Strategy Build Guide");
    }
    
}