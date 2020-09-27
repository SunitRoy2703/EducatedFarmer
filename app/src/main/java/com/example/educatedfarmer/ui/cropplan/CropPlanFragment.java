package com.example.educatedfarmer.ui.cropplan;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.educatedfarmer.Adapter;
import com.example.educatedfarmer.Movie;
import com.example.educatedfarmer.R;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CropPlanFragment extends Fragment {

    GridView datalist;

    List<String> titles;
    List<Integer> images;

    Adapter adapter;

    ArrayList<Movie> paddyList;

    ArrayList<Movie> cornlist;

    ArrayList<Movie> tomatolist;

    ArrayList<Movie> mustardlist;

    ArrayList<Movie> wheatlist;





    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View cropplan = inflater.inflate(R.layout.fragment_cropplan, container, false);

        datalist = cropplan.findViewById(R.id.cropplan_list);


        titles = new ArrayList<>();
        images = new ArrayList<>();

        titles.add("Paddy");
        titles.add("Maize");
        titles.add("Tomato");
        titles.add("Mustard");
        titles.add("Wheat");


        images.add(R.drawable.paddy);
        images.add(R.drawable.maize);
        images.add(R.drawable.tomato);
        images.add(R.drawable.mustard);
        images.add(R.drawable.wheat);

        paddyList = new ArrayList<>();
        paddyList.add(new Movie("1.Preparation of Field:",  "Paddy farmers used to get their fields ready before the rainy season. The weeds are cleared and the field is ploughed by buffaloes or tractors to a depth of few inches. Manures and fertilizers are added to the soil. The whole surface then remained covered with water of about 2.5 cm. The field is then ready for receiving seedlings from the nursery."));
        paddyList.add(new Movie("2.Transplantation:",  "Generally paddy seedlings are first prepared in nursery and then transplanting is done in the field after about 40 days. Although in some areas of India and Sri Lanka seeds have been sown directly in the field and the seedlings sprout when the rain comes. But yield of paddy from transplanting is greater than the direct sowing. The transplanted paddy also grows faster because of regular spacing and matures within a shorter period."));
        paddyList.add(new Movie("3.Field Maintenance:", "Paddy fields also require regular maintenance, such as occasional weeding and thinning out the more crowded patches, level of water is to be maintained according to the growth and the fields are drained dry before the crop is harvested."));
        paddyList.add(new Movie("4.Harvesting:",  "The traditional harvesting system is either through a curved knife or a sharp-edged knife. It is very labour-intensive. Harvesting is done in the dry season, when the weather is sunny. Mechanical combines which cut and thresh are used in Japan."));
        paddyList.add(new Movie("5.Threshing, Winnowing and Milling:", "After the paddy stalks have been gathered and dried for a brief spell, their threshing is usually done. By beating the sheaves against the bars, the grains are separated from the stalks. Now threshing machines have also been developed.\n" +
                "Winnowing is a process of removing the unwanted particles from the paddy grains. The simplest way is by pouring the paddy down from a height on a windy day to a large square mat on open ground. The grains fall to the mat while lighter chaff blows out. Sometimes hand-winnowing machines are also used.\n" +
                "\n" +
                "Milling means removal of the yellowish husks from paddy so that white or polished rice is obtained. In a rice mill the paddy is made to pass between varying sets of huller or rollers till it is milled or polished.\n" +
                "\n" +
                "Although, there are several varieties of rice, but on the basis of their location two varieties have been identified. These are: (i) upland rice, which is grown on upland areas; and (ii) lowland rice, which grows in low lying and marshy areas."));


        cornlist = new ArrayList<>();
        cornlist.add(new Movie("Step 1: Field selection",  "There are three key aspects of field selection:\n" +
                "\n" +
                "Altitude: Maize is a sub-tropical plant and the altitude at which it is grown is critical to its ability to mature.\n" +
                "\n" +
                "Wherever the crop is grown above 140m there must be other factors to favour of growing at this height, such south-facing and free-draining soil.\n" +
                "\n" +
                "Aspect: Aim for south-facing sites that are not too exposed.\n" +
                "\n" +
                "Soil type: Maize needs a dry soil in the spring, but not a soil type that will dry out too much in late spring when the young plants are developing.\n" +
                "\n" +
                "Growing maize on heavy, clay-type soils is probably the biggest handicap to trying to get the best out of this crop because of the difficulty in creating the correct seed-bed in the spring.\n" +
                "\n" +
                "Medium loams that are easy to work in the spring, free-draining and will warm up early in the season to enable the young plants to get the best possible start are the most favoured.\n" +
                "\n" +
                "Very free-draining and light, sandy soils can be too extreme."));
        cornlist.add(new Movie("Step 2: Seed-bed preparation", "The aim is to achieve a deep, loose seed-bed. Maize is a free-rooting plant so there needs to be no restriction on root development in the early stages.\n" +
                "\n" +
                "Crops that struggle with compaction then struggle to mature and achieve optimum yield.\n" +
                "\n" +
                "Farms with heavy soils often need to winter plough to achieve the correct seed-bed in the spring. But if there is a wet March, water can hold under the furrows and can take a long time to dry out.\n" +
                "\n" +
                "The topsoil can look dry and good, but it’s important to look deeper down and see what conditions are really like.\n" +
                "\n" +
                "See also: Dairy farmer increases maize yields by upping seed rates\n" +
                "\n" +
                "Crumblers and other machinery that will cultivate the ground to achieve the openness of the soil that maize requires for sowing should be used rather than any kit that will compact the bed. Being able to kick a foot through soils is a good guide."));
        cornlist.add(new Movie("Step 3: Drilling and sowing",  "Maize seed should be drilled to a uniform depth and into moisture.\n" +
                "\n" +
                "Soil temperatures should by 8C first thing in the morning for four to five consecutive days for maize to grow. \n" +
                "\n" +
                "The last 10 days of April should see all maize drilled, but climate will obviously depend on location.\n" +
                "\n" +
                "There is an old adage that says for every day that the crop is sown into the month of May there will be a 1% loss in yield.\n" +
                "\n" +
                "With seed treatments likely to be banned next year (2020), farmers should drill deeper to avoid rook damage. Seed must be deeper than a rook’s beak and so should be sown into the seedbed at least 7-8cm. \n" +
                "\n" +
                "To ensure correct sowing depth, growers should check behind the drill and uncover at least one-meter length of seed to ensure drilling depth and spacing are uniform. \n" +
                "\n" +
                "When seed is drilled deeper the seedbed is likely to be colder so growers should expect delayed germination. To offset this, it may be worth taking soil temperatures at 7-8cm deep and drilling later into warmer soils.\n" +
                "\n" +
                "Maize seed can come through from a deeper sowing, but if the soil conditions mean that it takes a long time to emerge, and then comes through into inclement spring weather, there will be losses.\n" +
                "\n" +
                "All sorts of drills have been evaluated for maize over the years, but most growers come back to precision drills and 76cm rows. Maize needs drilling slowly with one seed delivered every 11-13cm."));
        cornlist.add(new Movie("Step 4: Choosing a variety", "This should be based on experience of what has already been grown or what is being grown successfully on farms where conditions are similar.\n" +
                "\n" +
                "Yield is paramount for dairy farmers growing forage maize and must be a high priority in variety choice.\n" +
                "\n" +
                "A modest target is 49.9t/ha (20t/acre) freshweight. Always select a variety that has the potential to give the level of maturity needed by the end of October."));
        cornlist.add(new Movie("Step 5: Weed control",  "Once drilled, all fields should receive a pre-emergent herbicide to combat weeds.\n" +
                "\n" +
                "This will also mean post-emergence herbicides have less work to do.\n" +
                "\n" +
                "Don’t delay weed control. Once they reach the 2-leaf stage they will start out-competing maize. \n" +
                "\n" +
                "Maize is very poor at competing with weeds in its earliest stages of development so this must be avoided."));
        cornlist.add(new Movie("Step 6: Crop nutrition","Nitrogen is the driver and a lot of crops just don’t get enough because of an over-estimation of what the slurry can provide.\n" +
                "\n" +
                "Maize requires:\n" +
                "\n" +
                "180kg/ha of potash\n" +
                "40kg/ha of phosphate\n" +
                "And 150kg/ha of Nitrogen\n" +
                "Although these will vary depending on soil indices or where large quantities of FYM or slurry have been applied there should be no requirement for P and K.\n" +
                "\n" +
                "Therefore, farmers need to know precisely what nutrients have been applied by slurry or FYM.\n" +
                "\n" +
                "Ideally, the application of nitrogen should be split with 75% in the seedbed and the remaining 25% applied at the 1-3 leaf stage. This will help the crop get through its yellow phase often seen at emergence. "));
        cornlist.add(new Movie("Step 7: Pests and diseases","When maize follows grass there can be pest problems such as wire worms, but growers need to be aware that leather jacket and frit-fly sprays are banned after 31 March.\n" +
                "\n" +
                "Although maize is a relatively pest-free crop to grow, the removal of these treatments may have an impact in the future.\n" +
                "\n" +
                "European corn-borer has been a problem in the South West and eye-spot can also occur in some crops.\n" +
                "\n" +
                "Insecticide dressings can be applied at drilling and there is a fungicide dressing to prevent rotting of the newly drilled seed.\n" +
                "\n" +
                "These dressings break down after 21 days so there can be a risk where there is slow emergence of seed in cold, wet seed-beds.\n" +
                "\n"));
        tomatolist = new ArrayList<>();
        tomatolist.add(new Movie("1) When to Plant Tomatoes", "If you want to grow tomatoes from seed (versus transplants), you have to start with tomato seeds indoors 6 to 8 weeks before the average last spring frost date.\n" +
                "Transplant the tomato seedlings only after the last spring frost. By this time the soil becomes warm."));
        tomatolist.add(new Movie("2) Selecting and Preparing a Planting Site.", "Select a site that receives proper sunlight. Also, the soil should be well-drained. It is very important that the site where you will plant tomatoes receives at least 6 hours of daily sunlight.\n" +
                "site selection for tomato plantation\n" +
                "\n" +
                "Dig the soil 1 foot deep two weeks before transplanting the tomato plants. Mix aged manure or compost with the soil. This will improve the fertility of the soil. Thus improving the overall growth of the plants.\n" +
                "Some type of support system is generally recommended. But sprawling plants can also produce good quality of crops if you have enough space. Also, fine weather is helpful for better growth. However, the plants will be more prone to soil-borne diseases. They may even rot if not kept off the ground."));
        tomatolist.add(new Movie("3) How To Plant Tomatoes",  "Before planting in the garden, it is necessary to harden off the transplants or seedlings for a week before planting in the garden. Keep the young plants outdoors in the shade for 2-3 hours the first day. Gradually Increase their outdoor time. This will help them to get the necessary direct sunlight required for hardening.\n" +
                "How to plant tomatoes\n" +
                "Maintain a gap of 2 feet between the transplants.\n" +
                "\n" +
                "Place tomato cages or stake in the soil at the time of planting tomatoes. This is necessary to avoid damage the roots face later on. Caging helps the plant hold itself upright. Staking assists in fruit development above the ground.\n" +
                "\n" +
                "Pinch off a few of the lower branches present on transplants. Now, plant the root ball deep enough so that only the leaves on the lowest portion are just above the surface of the soil.\n" +
                "\n" +
                "If your transplants are thin or leggy, you can correct this by burying up to ⅔ of the plant. This will include the lower sets of leaves. Tomato stems have the natural ability to grow roots from the stems buried in the soil.\n" +
                "\n" +
                "In order to reduce shock to the roots, water well.\n" +
                "Growing Tomatoes in Containers\n" +
                "\n" +
                "Use a large container or pot. Make sure that it has drainage holes in the bottom.\n" +
                "Growing tomatoes in containers\n" +
                "Make use of loose, well-draining soil. We recommend a good potting mix mixed well with organic matter.\n" +
                "\n" +
                "Plant only one tomato plant per pot. Choose from the bush or the dwarf varieties; many of the cherry tomatoes grow better in pots.\n" +
                "\n" +
                "Taller varieties of tomatoes may need to be staked.\n" +
                "\n" +
                "Place the pot in a spot that receives 6 to 8 hours of sunlight in a day.\n" +
                "\n" +
                "Keep the soil moist. Containers always dry out quickly as compared to garden soil. Therefore make sure to check daily and provide ample water during a heatwave."));
        tomatolist.add(new Movie("4) How to Take Care of Tomato Plant", "Water enough for the first few days that the transplants or tomato seedlings are in the ground.\n" +
                "\n" +
                "Make sure to water well throughout the growing season. Water nearly about 2 inches per week during the summer season. Remember to water the transplants deeply for a strong and sturdy root system.\n" +
                "\n" +
                "Always water the plants in the early morning hours. This provides the plant with the moisture it needs to make it through an entire hot day. Avoid watering the plant during late afternoon or evening.\n" +
                "\n" +
                "Take care of tomato plants\n" +
                "Mulch the soil five weeks after transplanting the seedlings to retain moisture present in soil and to control weeds. Mulch also keeps the soil from the splashing of the lower tomato leaves.\n" +
                "\n" +
                "To help tomatoes grow properly through periods of drought, find few flat rocks and place the rocks one next to each plant. The rocks will prevent the evaporation of water from the soil.\n" +
                "\n" +
                "Supply the plants with fertilizer or compost every two weeks starting from the point when the tomato fruits are nearly about 1 inch in diameter.\n" +
                "\n" +
                "If you are using stakes, prune plants by pinching off suckers (side stems). Ensuring that only a few branches are growing from each plant. The suckers usually grow between the branches and the main stem.\n" +
                "\n" +
                "Tie the developing stems to stakes with thread or soft string.\n" +
                "\n" +
                "As the plants thrive, cut all the leaves off the bottom 12 inches from the stem. Splashes from rainwater may result in the transfer of diseases from soil to the foliage. Trimming the lower leaves helps in preventing this.\n" +
                "\n" +
                "Practice crop rotation every year to prevent the spread of diseases and to maintain soil fertility."));
        tomatolist.add(new Movie("5) Pests/Diseases",  "Tomatoes are most susceptible to insect pests, especially whiteflies and tomato hornworms.\n" +
                "\n" +
                "\n" +
                "Late Blight is a type of fungal disease that usually strikes during any time of the growing seasons. It causes grey, moldy spots on fruits and leaves which later turn brownish. The disease spreads and is supported by continuous damp weather. This disease will run until winter, so make sure to destroy all infected plants.\n" +
                "\n" +
                "Diseases in tomatoes\n" +
                "Mosaic Virus causes distortion of leaves and causing the growth of young plants to be twisted and narrow. The leaves also become yellow. Unfortunately, all the plants infected should be destroyed (don’t put them in your compost pile).\n" +
                "\n" +
                "\n" +
                "Cracking: When the fruit growth is very rapid, the skin will eventually crack. This mostly occurs because of uneven watering or uneven moisture received from weather conditions (very rainy periods mixed along with dry periods). Keep the moisture levels constant with mulching and consistent watering."));
tomatolist.add(new Movie("6) How To Harvest Tomatoes" ,
        "Leave your tomatoes on the vines as long as you can. If any of the tomatoes fall off the plant before they appear ripe, place the tomatoes in a paper bag with the stem up and store them in a dark, cold place.\n" +
        "Harvesting tomatoes\n" +
        "Never keep the tomatoes on a sunny windowsill to ripen. The tomatoes may rot even before they are ripe!\n" +
        "\n" +
        "The perfect tomato for picking will be very red in color and firm, irrespective of the size, with perhaps some remaining yellow around the stem. If you grow yellow, orange or any other color tomato, wait until the tomato turns to the correct color.\n" +
        "\n" +
        "If your tomato plant bears fruit when the first hard frost threatens, pull up the entire plant from the soil. Now, hang the plant upside down in the garage or basement. Pick tomatoes as soon as they ripen.\n" +
        "\n" +
        "Do not refrigerate fresh tomatoes. Doing so will spoil the texture and flavor and texture."));
        mustardlist = new ArrayList<>();
        mustardlist.add(new Movie("step 1",  "How to Plant Mustard Seed Mustard seed plants are normally grown from seed but can be grown from purchased seedlings as well. When selecting mustard seeds for planting, any mustard plant grown for greens can also be grown for mustard seed. Plant the mustard seed about three weeks before your last frost date. Since you’ll be harvesting the mustard seed, there’s no need to use succession planting like you do with mustard greens. Plant your mustard seeds about an inch apart. Once they sprout, thin the seedlings so that they are 6 inches apart. Mustard plants grown for seed are planted further apart than plants grown for just leaves as the mustard plant will be getting much larger before it flowers. If you are planting purchased mustard seedlings, plant these 6 inches apart as well.\n" +
                "\n"));
        mustardlist.add(new Movie("step 2",  "How to Grow Mustard Seeds Once mustard seed plants start growing, they need little care. They enjoy cool weather and will bolt (flower) quickly in warmer weather. While this may seem like a great thing if you are looking to grow mustard seeds, it is not. Mustard plants that bolt due to warm weather will produce poor flowers and seeds. It’s best to keep them on their normal flowering cycle to be able to harvest the best mustard seeds. Mustard seed plants need 2 inches of water a week. Normally, during cool weather, you should get enough rainfall to supply this, but if you don’t, you’ll need to do additional watering. Mustard seed plants don’t need fertilizer if they have been planted in well amended garden soil, but if you’re unsure if your soil is nutrient rich, you can add a balanced fertilizer to the roots once the plants are 3 to 4 inches tall.\n" +
                "\n"));
        mustardlist.add(new Movie("step. 3", "How to Harvest Mustard Seeds The mustard plants will eventually flower and go to seed. The flowers of mustard seed plant are generally yellow but some varieties have white flowers. As the mustard flower grows and matures, it will form pods. Watch for these pods to start to turn brown. Another sign that you are nearing harvest time will be that the leaves of the plant will start to yellow. Be careful not to leave the pods on the mustard seed plant for too long as they will burst open when fully ripe and the mustard seed harvest will be lost. The next step in harvesting mustard seeds is to remove the seeds from the pods. You can do this with your hands, or you can place the flower heads in a paper bag and allow them to finish maturing. The pods will open on their own in one to two weeks and a gentle shake of the bag will shake loose most of the mustard seeds. Mustard seeds can be used fresh, but like other herbs and spices, if you plant on storing them long term, they will need to be dried.\n" +
                "\n"));

        wheatlist = new ArrayList<>();
        wheatlist.add(new Movie("1. It’s all about timing",  "Wheat should be planted in the spring or the autumn – timing is important, so it’s a good idea to make a note on your calendar of when you need to start planting your seeds."));
        wheatlist.add(new Movie("2. Prepare the soil",  "You’ll need some good rich soil, so it’s best to dig in some compost. (You can buy bags of compost at garden centres and DIY stores. Or you could make your own by throwing all your food waste into a compost bin. It takes a few months for it to be ready to use, but it’s worth the wait.) Make sure the ground is fairly even - you can use a shovel and rake to do this. Most children love digging and raking – so sit back and let them play!"));
        wheatlist.add(new Movie("3. Get planting", "Sprinkle the seeds over the soil - you need 3 oz for every 100 square feet (85 g for every 10 square meters). It’s best to help your child do this – just in case you get wheat in your flower beds!"));
        wheatlist.add(new Movie("4. Rake it out",  "Rake over the soil to cover the seeds. Help your child out with this job as it needs a gentle touch."));
        wheatlist.add(new Movie("5. Scare the crows!",  "You probably won’t need a scarecrow – but if you’re planting outside you’ll need to cover the seeds to protect them from birds."));
        wheatlist.add(new Movie("6. Just add water",  "Make sure the seeds get enough water - if it doesn’t rain, water them once a day. (Why not get your child their own little watering can?) If you go away, instead of asking a neighbour to water your crop, you could use an automatic watering system. You can pick up an inexpensive and easy to use kit from your local DIY stores or garden centre."));
        wheatlist.add(new Movie("7. See how they grow!",  "Be patient, and before long you’ll see the first green shoots. By midsummer (or a bit later for spring wheat) the colour of the stalks will turn from green to yellow or brown. And the heads will become heavy with grain and start to bend forward. So now you have your own crop of golden wheat, what are you going to do with it? Well, you could harvest it and make your own wheat flour. Alternatively, you could sit back and admire your beautiful golden wheat – it really does look fantastic and is an unusual addition to your garden or outside area."));

//        cornlist = new ArrayList<>();
//        cornlist.add(new Movie("chotton", "7.9", "2008", "After being held captive in an Afghan cave, billionaire engineer Tony Stark creates a unique weaponized suit of armor to fight evil."));
//        cornlist.add(new Movie("The Incredible Hulk", "6.7", "2008", "Bruce Banner, a scientist on the run from the U.S. Government, must find a cure for the monster he turns into, whenever he loses his temper."));
//        cornlist.add(new Movie("Iron Man 2", "7.0", "2010", "With the world now aware of his identity as Iron Man, Tony Stark must contend with both his declining health and a vengeful mad man with ties to his father's legacy."));
//        cornlist.add(new Movie("Thor", "7.0", "2011", "The powerful but arrogant god Thor is cast out of Asgard to live amongst humans in Midgard (Earth), where he soon becomes one of their finest defenders."));
//        cornlist.add(new Movie("Captain America: The First Avenger", "6.9", "2011", "Steve Rogers, a rejected military soldier transforms into Captain America after taking a dose of a Super-Soldier serum. But being Captain America comes at a price as he attempts to take down a war monger and a terrorist organization."));
//
//        cornlist = new ArrayList<>();
//        cornlist.add(new Movie("chotton", "7.9", "2008", "After being held captive in an Afghan cave, billionaire engineer Tony Stark creates a unique weaponized suit of armor to fight evil."));
//        cornlist.add(new Movie("The Incredible Hulk", "6.7", "2008", "Bruce Banner, a scientist on the run from the U.S. Government, must find a cure for the monster he turns into, whenever he loses his temper."));
//        cornlist.add(new Movie("Iron Man 2", "7.0", "2010", "With the world now aware of his identity as Iron Man, Tony Stark must contend with both his declining health and a vengeful mad man with ties to his father's legacy."));
//        cornlist.add(new Movie("Thor", "7.0", "2011", "The powerful but arrogant god Thor is cast out of Asgard to live amongst humans in Midgard (Earth), where he soon becomes one of their finest defenders."));
//        cornlist.add(new Movie("Captain America: The First Avenger", "6.9", "2011", "Steve Rogers, a rejected military soldier transforms into Captain America after taking a dose of a Super-Soldier serum. But being Captain America comes at a price as he attempts to take down a war monger and a terrorist organization."));
//
//        cornlist = new ArrayList<>();
//        cornlist.add(new Movie("chotton", "7.9", "2008", "After being held captive in an Afghan cave, billionaire engineer Tony Stark creates a unique weaponized suit of armor to fight evil."));
//        cornlist.add(new Movie("The Incredible Hulk", "6.7", "2008", "Bruce Banner, a scientist on the run from the U.S. Government, must find a cure for the monster he turns into, whenever he loses his temper."));
//        cornlist.add(new Movie("Iron Man 2", "7.0", "2010", "With the world now aware of his identity as Iron Man, Tony Stark must contend with both his declining health and a vengeful mad man with ties to his father's legacy."));
//        cornlist.add(new Movie("Thor", "7.0", "2011", "The powerful but arrogant god Thor is cast out of Asgard to live amongst humans in Midgard (Earth), where he soon becomes one of their finest defenders."));
//        cornlist.add(new Movie("Captain America: The First Avenger", "6.9", "2011", "Steve Rogers, a rejected military soldier transforms into Captain America after taking a dose of a Super-Soldier serum. But being Captain America comes at a price as he attempts to take down a war monger and a terrorist organization."));

        final ArrayList allinOne = new ArrayList();
        allinOne.add(paddyList);
        allinOne.add(cornlist);
        allinOne.add(tomatolist);
        allinOne.add(mustardlist);
        allinOne.add(wheatlist);
        adapter = new Adapter(getActivity(), titles, images);

        datalist.setAdapter(adapter);

        datalist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(getContext(), CropPlanGridItem.class);
                intent.putExtra("name", titles.get(i));
                intent.putExtra("image", images.get(i));
                Bundle args = new Bundle();
                args.putSerializable("ARRAYLIST",(Serializable)allinOne.get(i));
                intent.putExtra("BUNDLE",args);
                startActivity(intent);

            }
        });

        return cropplan;

    }


}