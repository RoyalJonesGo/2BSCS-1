import java.util.*;
import java.io.*;

public class BlockSectionDA {
    private List<BlockSection> blockSectionList;

    //set getter method
    public List<BlockSection> getBlockSectionList(){
        return blockSectionList;
    }

    //create constructor - set initial actions of an object
    public BlockSectionDA() throws FileNotFoundException {

        blockSectionList = new ArrayList<>();

        Scanner blockFile = new Scanner (new FileReader("BlockFile.csv"));

        while(blockFile.hasNext()){
            BlockSection blockSection = new BlockSection();

            String blockSectionRaw = blockFile.nextLine();
            String[] blockSectionArray = new String[2];
            blockSectionArray = blockSectionRaw.split(",");

            //set tge values for the blockSection object
            blockSection.setBlockCode(blockSectionArray[0].trim());
            blockSection.setAdviser(blockSectionArray[1].trim());

            StudentDA studentDA = new StudentDA(blockSection.getBlockCode());
            blockSection.setStudentList(studentDA.getStudentList());

            blockSectionList.add(blockSection);
        }
        blockFile.close();
    }
}
