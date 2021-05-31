package com.dicoding.kulinero.food

import com.dicoding.kulinero.R

object FoodData {
    private val foodNames = arrayOf(
        "Rendang",
        "Nasi Goreng",
        "Sushi",
        "Tom Yam Goong",
        "Pad Thai",
        "Som Tam",
        "Dim Sum",
        "Ramen",
        "Peking Duck",
        "Kari Massaman"
    )

    private val foodDetails = arrayOf(
        "Beef rendang is one of the original cuisines of Minangkabau descent and Sumatra’s culture. It is served at special occasions to honor guests and during festive seasons. It is a delicious Indonesian dish prepared with a myriad of herbs and spices cooking for a few hours until all the liquids have been completely absorbed by the meat. Beef rendang is best eaten with steamed rice and condiments such as fried onions and chili pieces.",
        "Nasi goreng is often referred to as the Indonesian version of fried rice. Although it is considered to be the national dish of Indonesia, it is also commonly eaten in Malaysia and Singapore. It is believed that the tradition of frying rice in Indonesia came from the Chinese culture, when the trade between the two countries started to develop. Indonesians adopted the Chinese tradition based on the belief that it is sinful to waste food, and soon, like many other versions of fried rice, nasi goreng was created. Since it was developed out of a practical need, it is usually eaten for breakfast and made with leftover rice from the previous day.",
        "Sushi is Japan's most famous culinary representative, typically made with rice and fillings which have been rolled inside a a sheet of dry seaweed. However, the term sushi is actually an umbrella term covering a wide range of subvarieties which can be made with a myriad of different ingredients and in as many forms and presentations. Although the dish has become wrongly synonymous with raw fish, the primary ingredient of every type of sushi is only vinegared rice. Originally, sushi was only a method of preserving fish - first developed in Southeast Asia, but it reached Japan in the 8th century.",
        "Tom Yum is one of the best known Thai dishes, a spicy, sour, and aromatic soup that is traditionally served with rice. It consists of shallots, lemongrass, fish sauce, minced fresh ginger or galangal, shrimps, mushrooms, kaffir lime leaves, lime juice, and minced Thai chili peppers. Usually served as an appetizer, tom yum is traditionally garnished with coriander leaves on top. Due to its popularity, different versions of the soup started to appear over the years, such as tom yum gai, with added chicken, and tom yum talay, with mixed seafood.",
        "Pad Thai is Thailand's national dish, a flavorful stir-fry (pad in Thai) dish consisting of rice noodles, tofu, dried shrimp, bean sprouts, and eggs. If it's made with meat, chicken and pork are some of the most popular choices. The flavors are an intricate combination of sweet, sour, and salty, with a well-balanced contrast of textures. Pad Thai is probably one of the most popular Thai dishes abroad. Its origins can be traced to a period of nationalism in the country, after the 1932 revolution that ended the absolute monarchy. There was a public contest to find a new national noodle dish, and the winner was a Pad Thai consisting of noodles, radish, sprouts, peanuts, and eggs.",
        "Som tam is a green papaya salad mostly associated with the northeastern part of Thailand (Isaan), though it is often suggested that it first appeared in Laos.  Apart from thin strips of green papaya, this salad usually includes roasted peanuts, green beans, tomatoes, and a tangy sauce typically made with garlic, chili peppers, fish sauce, dried shrimps, palm sugar, and lime or tamarind juice. The varieties are plentiful and can include various additions. The sauce can also appear in many other combinations, and can significantly vary in sweetness and spiciness. Numerous restaurants and street stalls allow the customers to choose the variety they prefer and adjust the ingredients to their preference.",
        "Dim sum is a variety of bite-sized food that is usually served with tea. It can range from savory dumplings, buns, and noodle rolls to sweet puddings and tarts. The term dim sum translates to touch the heart, and according to legend, it was invented many centuries ago by cooks of the Royal Court in order to touch the heart of Chinese emperors (but not to fully satiate their hunger). What started as a simple snack is now a key part of Chinese culture. It is also a ritual family dish eaten on most weekend mornings in Hong Kong. Each dish usually consists of a few pieces of dim sum varieties, served in steamer baskets or on small plates, making them great for sharing or trying out new flavors.",
        "Ramen is a noodle soup that first appeared in Japan in 1910, when Chinese cooks combined the noodles with a salty broth. These curly noodles were of bright yellow color and more elastic than the Japanese noodles prepared at the time – the dough was kneaded with a sodium carbonate-infused mineral water called kansui. In 1958, its name was derived from the pronunciation of the Chinese word lamian (pulled noodles), and that same year, Nissin Foods produced the first-ever instant version of noodles with a chicken-flavored broth called Chickin Ramen.",
        "The history of Peking duck goes back to China's Yuan Dynasty of the 13th century. Bianyifang, Beijing's oldest restaurant specializing in Peking duck has been in business since the Jiajing reign of the 16th century, serving as a testament to the popularity of this succulent, tantalizing dish. The duck is cooked until the skin turns golden and crispy and the meat becomes tender, slightly sweet, and moist. Both the meat and the skin are then folded in thin pancakes or steamed white buns. To make an authentic Beijing kao ya, the duck must be a white feathered Imperial Peking duck, hung for 24 hours, and pumped with air through a small puncture between the breasts and wings.",
        "Out of all Thai curry varieties, massaman curry stands out as the mildest, sweetest, and the most unusual type. It is a combination of creamy coconut milk, meat, potatoes, and a curry paste made with roasted spices. Coconut milk is the authentic Thai element of the dish, providing a rich base for the rest of the ingredients. Since it is cooked for a long time, massaman curry usually employs thicker cuts of beef or bone-in chicken, and occasionally lamb or mutton. The list of spices commonly used in massaman is versatile and extensive. It usually employs a combination of dry spices such as cumin, coriander, cloves, cinnamon, and peppercorns, mixed with fresh garlic, chili, galangal, lemongrass, tamarind paste, and palm sugar."
    )

    private val foodIngredients = arrayOf(
        "4 candlenuts\n" +
                "12 cloves chopped garlic\n" +
                "300 g red chili, , (Serrano chili/pepper)\n" +
                "250 g onions\n" +
                "50 g ginger\n" +
                "50 g galangal\n" +
                "25 g ground turmeric, or 50g of fresh turmeric\n" +
                "1½ tsp ground coriander\n" +
                "1 tbsp salt\n" +
                "1 tsp sugar\n" +
                "4 green cardamom pods\n" +
                "11/2 tsp cumin seeds\n" +
                "10 cloves\n" +
                "4 stalks lemongrass, , bashed\n" +
                "3 pieces kaffir lime leaves\n" +
                "1 piece asam keping\n" +
                "2 turmeric leaves, ,tied up",
        "4 cloves garlic\n" +
                "1 tbsp fried anchovies\n" +
                "10g (0.3 oz) of belacan\n" +
                "6 bird’s eye chili (red and green mix)\n" +
                "4 shallots, about 40g\n" +
                "Cooking oil\n" +
                "60g (2 oz) Kangkong (water spinach)\n" +
                "50g (1.75 oz) long beans\n" +
                "10g (0.3 oz) ikan bilis (about one handful)\n" +
                "100g (3 oz) chicken breast meat 60g, cut into dice\n" +
                "2 egg\n" +
                "300g (10 oz) cooked rice\n" +
                "2 tbsp kicap manis (Indonesian sweet soy sauce)\n" +
                "1/4 tsp ground white pepper\n" +
                "1 tsp sugar\n" +
                "1 tsp salt",
        "⅔ cup uncooked short-grain white rice\n" +
                "3 tablespoons rice vinegar\n" +
                "3 tablespoons white sugar\n" +
                "1 ½ teaspoons salt\n" +
                "4 sheets nori seaweed sheets\n" +
                "½ cucumber, peeled, cut into small strips\n" +
                "2 tablespoons pickled ginger\n" +
                "1 avocado\n" +
                "½ pound imitation crabmeat, flaked",
        "12 oz. (350 g) shrimp or tiger prawn, head-on and shell-on\n" +
                "2 1/2 cups shrimp stock (preferred), canned chicken stock, or water\n" +
                "1 stalk lemongrass, cut into 3-inch strips, pounded with a cleaver\n" +
                "3 slices galangal\n" +
                "6 kaffir lime leaves, bruised\n" +
                "6 bird's eyes chilies, pounded\n" +
                "6 fresh oyster mushrooms, cut into pieces\n" +
                "2 tablespoons nam prik pao, Thai roasted chili paste\n" +
                "2 tablespoons nam prik pao oil\n" +
                "3 teaspoons fish sauce\n" +
                "3 1/2 tablespoons lime juice\n" +
                "Cilantro leaves, for garnishing",
        "4 oz. (115 g) packaged flat rice noodles\n" +
                "2 tablespoons oil\n" +
                "1 clove garlic, finely minced\n" +
                "4 oz. (115 g) medium-sized shrimp, shelled and deveined\n" +
                "2 oz. (56 g) fried firm tofu, cut into slices\n" +
                "1 large egg\n" +
                "4-6 oz. (115 g-170 g) bean sprouts\n" +
                "1 oz. (30 g) chinese chives or scallions, cut into 2-inch lengths\n" +
                "2 tablespoons crushed peanuts\n" +
                "lime wedges",
        "1 Small Green raw papaya, shredded\n" +
                "4 Long beans, chopped\n" +
                "6 Garlic cloves\n" +
                "8 Cherry tomatoes (cut into quarters)\n" +
                "6 Red or green chilly\n" +
                "2 TBSP Palm sugar (or 1 Tbsp regular sugar)\n" +
                "3 TBSP Lime juice\n" +
                "2 TBSP Fish sauce or soy sauce\n" +
                "3 TBSP Ground peanuts, roasted\n" +
                "For garnishing Fresh lettuce, green beans, lime wedges and chilly",
        "1/2 lb. (0.2 kg) boneless and skinless chicken thigh, ground\n" +
                "8 peeled and deveined medium shrimp, diced into small pieces\n" +
                "2 black fungus, soaked in hot water and cut into thin threads, or fresh shiitake mushrooms\n" +
                "1/2 tablespoon finely chopped fresh ginger\n" +
                "1/2 tablespoon finely chopped scallion, white part only\n" +
                "1/4 teaspoon sesame oil\n" +
                "3 dashes ground white pepper\n" +
                "1/2 teaspoon soy sauce\n" +
                "1/2 tablespoon cornstarch\n" +
                "1 pinch salt\n" +
                "wonton wrapper\n" +
                "green peas and tobiko, fish roes, for garnishing",
        "6 oz. (170 g) fresh ramen noodles\n" +
                "4 cups water\n" +
                "4 tablespoons white miso paste\n" +
                "3-4 teaspoons S&B La Yu or chili oil\n" +
                "1/2 teaspoon hondashi\n" +
                "2 hard-boiled eggs\n" +
                "1/2 can corn kernels, (15 oz. /425 g)\n" +
                "1 narutomaki, Japanese fish cake with a pink swirl\n" +
                "1 stalk scallion, finely chopped\n" +
                "1 tablespoon white sesame seeds, pound with mortar and pestle until fine\n" +
                "light soy sauce, to taste, optional\n" +
                "some seasoned roasted seaweed, cut into thin strips",
        "1 (4 pound) whole duck, dressed\n" +
                "½ teaspoon ground cinnamon\n" +
                "½ teaspoon ground ginger\n" +
                "¼ teaspoon ground nutmeg\n" +
                "¼ teaspoon ground white pepper\n" +
                "⅛ teaspoon ground cloves\n" +
                "3 tablespoons soy sauce\n" +
                "1 tablespoon honey\n" +
                "1 orange, sliced in rounds\n" +
                "1 tablespoon chopped fresh parsley, for garnish\n" +
                "5 green onions\n" +
                "½ cup plum jam\n" +
                "1 ½ teaspoons sugar\n" +
                "1 ½ teaspoons distilled white vinegar\n" +
                "¼ cup finely chopped chutney",
        "1.5 lbs (0.6kg) cubed chuck beef or stewing beef\n" +
                "3 tablespoons Massaman curry paste\n" +
                "10 green cardamom seeds\n" +
                "2 cinnamon sticks\n" +
                "3 star anise\n" +
                "8 shallots, peeled\n" +
                "2 cans coconut milk (5.6 fl oz each)\n" +
                "1 cup water\n" +
                "2.5 tablespoons fish sauce, or to taste\n" +
                "1 medium-sized potato, peeled and cut into chunks\n" +
                "0.5 tablespoon tamarind paste\n" +
                "2 tablespoons palm sugar or brown sugar\n" +
                "4 tablespoons unsalted roasted peanuts\n" +
                "2 tablespoons cooking oil\n" +
                "fresh Thai basil leaves",
    )

    private val foodImages = intArrayOf(
        R.drawable.rendang,
        R.drawable.nasgor,
        R.drawable.sushi,
        R.drawable.tom_yam_goong,
        R.drawable.pad_thai,
        R.drawable.som_tam,
        R.drawable.dimsum,
        R.drawable.ramen,
        R.drawable.bebek_peking,
        R.drawable.kari_massaman
    )

    val listData: ArrayList<Food>
        get() {
        val list = arrayListOf<Food>()
            for (position in foodNames.indices) {
                val food = Food()
                food.name = foodNames[position]
                food.detail = foodDetails[position]
                food.ingredient = foodIngredients[position]
                food.photo = foodImages[position]
                list.add(food)
            }
            return list
        }
}