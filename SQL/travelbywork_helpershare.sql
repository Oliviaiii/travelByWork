-- MySQL dump 10.13  Distrib 8.0.31, for macos12 (x86_64)
--
-- Host: localhost    Database: travelbywork
-- ------------------------------------------------------
-- Server version	8.0.33

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `helpershare`
--

DROP TABLE IF EXISTS `helpershare`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `helpershare` (
  `helpershareid` int NOT NULL AUTO_INCREMENT,
  `helpmemberid` varchar(30) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  `account` varchar(30) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  `username` varchar(30) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  `startdate` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  `enddate` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  `place` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  `storename` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  `worktype` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  `workdetail` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  `grade` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  `content` varchar(3000) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `updatedate` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  PRIMARY KEY (`helpershareid`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `helpershare`
--

LOCK TABLES `helpershare` WRITE;
/*!40000 ALTER TABLE `helpershare` DISABLE KEYS */;
INSERT INTO `helpershare` VALUES (19,'31','asd12301','大波霸女孩','2020-07-16','2020-08-27','GreenIsland','釣漁人','restuarant','外場接待','ten','讚讚讚喔','2023-08-25 11:14:35'),(20,'31','asd12301','女孩','2023-08-21','2023-09-04','GreenIsland','不如來潛水','divestore','導潛','six','讚死','2023-08-25 15:45:32'),(22,'35','asd12305','研究生讓你研究生','2023-08-14','2023-08-21','花蓮','沐光','民宿','處理房務','8分','來到沐光三個星期多以來，嘗試跟上老闆和管家的腳步。我想我學會的，是誠意。\n身為小幫手，看著你們對民宿的堅持，\n小至將開關上的指紋印擦淨，大至為桌遊室牆面佈上點點星光，\n讓客人親手寫下的話得以讓其他人看到，留下回憶。\n\n每件事，都是為了讓來到沐光的人們，感到舒適、自在，像是回到一個有溫度的家。\n把事情做好，是希望能讓沐光再更好一些，就像是為了突破框架般似的。\n其實，有些感動很小很小，幾乎是毫不起眼的那種，但，卻非常重要。\n看著眼前如此優秀的你們這麼努力，心想，這就是我未來想要成為的模樣。\n\n在沐光，除了白天處理房務、下午跟其他小幫手出遊外，\n最特別的，是碰見許多很棒又有趣的房客。\n這裡，有結伴環島的客人，也有來自不同國家的人。\n每個人，都帶著屬於自己的故事來到沐光，除了晚上聊天還會相約出遊。\n記得那晚，四人騎著摩托車到花蓮不知名的海岸邊，有朋友們的歡笑聲相伴，一起看沉睡在晚風迷人的夜色，是很難忘的回憶。\n整趟換宿生活，我深深覺得，打工換宿並不只是到一個地方以勞動換取免費旅遊的權利，\n更是給自己一個機會更了解自己的過程。\n我想，旅行其實是人對生命的自我追尋、自我放逐，甚至是自我逃避。\n也許每個人，都需要給自己一點時間去排除外界的聲音，逃離自己日復一日的生活，\n好好思考自己想要的到底是什麼，在換宿的日子慢慢摸索答案。\n「有時候不是人生無趣，而是我們從沒有好好認真過生活。」\n\n在花蓮將近一個月來，感謝一路上遇到的每個人。謝謝小幫手們，\n小冬、阿協、芒果、喬喬、阿銘、褶子、阿蘋、大樹、Lami。\n謝謝你們豐富了2023的暑假，讓我明白即使只有短短幾天，我們依然可以過得很享受～\n謝謝Jessie，一位很照顧我們小幫手的女孩。\n離開沐光後，我想我會很想念她的大笑、她的水梨、她的後空嚇人鬼臉，\n和她對話時給人溫暖的感覺。\n最後，很感謝「打工換宿趣」提供媒合打工換宿的機會，讓我遇見沐光，在我們對原本的生活感到麻木時，\n還有一個機會，去重新認識、體會這個世界。','2023-08-28 15:26:26'),(23,'34','asd12304','烏來山道神','2014-05-29','2014-06-30','蘭嶼','蘭風','民宿','清潔','10分','上班族的身份一開始打工換宿老實說很不適應，原本是坐在冷氣房打打電腦、動動腦就可以賺進不錯的薪水，現在則是拿著抹布跟馬桶刷、穿著粗布衣，或蹲或跪的清潔，一開始會質疑自己究竟在做什麼、在想什麼，但隨著時間過去，漸漸地身體的勞動帶來心裡上的平靜，擦拭掉的好像不僅是房間的塵埃，也有自己內心那些紛亂與不確定性。\n\n打工換宿也可以遇到許多人，當地的人、換宿的人、遊玩的人，在這些人身上看到許多生活的態度、聽到許多人生的故事，這些人、那些故事，讓我越來越坦然、越來越接受自己、也體認到自己的渺小。\n\n第三次拜訪，待了近一個半月，有更多時間與機會觀察這座島嶼，這才發現世界上沒有哪個地方是全然的美好，但本來也就沒有一個地方是完美的。\n原本覺得一年因為旅遊旺季工作半年，另外淡季的半年再到*大島工作是件很酷且有個性的生活方式，進一步了解後覺得這樣的生活其實很不得不，年輕力壯時可以四處打零工，一邊賺錢一邊學習技能，但如果身體不強健了，誰願意請中年又短期打工的人呢?\n（＊註：達悟人稱台灣為本島或大島。）\n\n在小島上，只要會生存就好，身而為人，這很基本，可是對都市人卻很難，因為我們已經習慣被服務的好好，只要有錢就可以三餐溫飽。而小島人打魚、種芋頭、種地瓜、種菜，自己蓋房子，要什麼靠雙手達成，他們看風向、看浪況，在島上他們閃閃發亮，生存的很好，可是在大島，生存沒那麼單純，這些技能也不一定需要。\n\n一個島嶼、六個部落，小小的，人跟人之間很親，是用人情的在管理社會的秩序，有很多認識的人，大家互相幫忙，但一點點風吹草動也躲不過大家的眼睛，生活地有溫度又生活地小心翼翼。\n\n蘭嶼的天，藍的不可思議，空氣都是大自然的味道，海風不黏不膩，一陣一陣的好像再煩惱的憂愁都會被吹走，夜晚又深又黑，繁星灑滿整個夜空，近的仿若一伸出手就摘的到，在這裡，好像無條件地被接納，這，是蘭嶼獨特的魅力。\n\n即使遊客再多、即使再忙、即使生活還是有很多不得不，但達悟人還是可以用溫暖的笑臉、開朗的隨意面對這一切，這，是蘭嶼人獨厚的樂觀。\n\n風景美、有獨特文化的地方很多，但小島那理直氣壯的自在、那對人直接坦然的溫度，讓人流連忘返。謝謝這座美麗的島嶼給我一個璀璨的夏，一顆無畏無懼的心、一個家。','2023-08-28 15:49:54'),(24,'36','asd12306','不吃早餐的帥哥','2022-07-07','2022-08-08','綠島','福爾摩沙民宿','民宿','負責洗廁所、有的人負責鋪床換床單、我則是負責補齊備品，然後再一起掃地拖地','9分','今年3、4月，我在「打工換宿趣」尋找蘭嶼、澎湖、綠島、小琉球的換宿機會，因為從沒去過這些地方，所以充滿無限想像，也就這麼誤打誤撞來到了綠島。當初下這個決定後，朋友、家人都很擔心，從小幾乎沒離開過台北，這次一去就是前往多數人不熟悉的綠島30天。其實直到出發前我還是有些猶豫，但都應徵上了，我決定勇敢踏出去了！\n在民宿裡，與我同期的換宿生總共5個，3個女生、2個男生，大多與我年紀相仿。我們每天輪流早起收拾客人吃完早餐的碗盤，然後等到10點客人退房後，再分工合作整理房間。有的人負責洗廁所、有的人負責鋪床換床單、我則是負責補齊備品，然後再一起掃地拖地。\n民宿的老闆和老闆娘都來自台東，他們不像老闆，反而像爸媽，每個下午要出門前都會叨念著我們要注意安全，晚上回家也能吃到「媽媽」親手做的家常菜。因為這些朋友（或者更該說是家人），當初的擔憂日漸散去，取而代之的是對接下來每一天的嚮往與期待。\n\n來這裡之前就有人告訴過我，來過一定會愛上綠島。一開始我不相信，但漸漸地，我終於知道那是真的。在這個幾乎走幾步就能看見海的地方，以往在大都市的煩惱，瞬間都變得好小好小。\n\n本來以為在綠島，認識的只會有換宿夥伴、老闆，頂多加上一些房客。但因緣際會下，竟然與整個島上的換宿生玩在一塊了！這個夏天，幾年前來過的換宿生正好回島上舉辦了「夏夜市集」，就好像一群國中生一起住在學校宿舍一樣，大家天天玩在一起，到了晚上再各自回到自己的寢室。「明天去哪玩？」成了我們每天必問的一題。除了燕子洞、人權紀念公園、藍洞等網路上比較容易搜尋到的景點之外，我們也發掘了一些秘境。「哈巴狗與睡美人岩」算當地的著名景點，因形狀而得名。相傳哈巴狗跟睡美人吵架了，因此只能一直背對她，但卻始終不離不棄。\n\n很多人會遠觀並拍照，但事實上，睡美人脖子下那片鮮為人知的沙灘，才是整個綠島最讓我心醉的地方。踩著刺刺的礁岩長途跋涉才能抵達，這裡沒有觀光客、沒有垃圾，只有沙子、珊瑚、貝殼與海浪聲，伴著我度過最平靜的時光。有機會來到這裡，千萬要來體驗看看！\n海是這塊土地上最迷人的景色，我們甚至曾花了5個小時什麼都不做，就只是一直走路、看海。從清晨走到太陽升起，那一路我們把整個綠島藍藍的海、綠油油的山都收進眼裡，還有梅花鹿和山羊們作伴。\n\n沒什麼高樓大廈的綠島，夜晚有時能見到滿天的星空和銀河、月出、月光海，真的很美。我們常常就躺在牛頭山的草原上，數著誰看見的流星多，那些日子現在回想起來都還會笑呢。\n\n除了騎機車，綠島教會我的另一件事情就是游泳。從小怕水的我，來打工換宿頂多只期待看看海，根本沒想過要下水，游泳池都怕了，更何況深不見底的海？\n\n但不知怎麼了，在其他換宿生一句「要一起下水嗎？」問候後，我竟然有膽子放開魚雷浮標飄在海上，最後甚至潛到水裡！回台北已經一個多月，至今想來依然不可思議。海裡的那種藍，沒有親眼看過絕對不會相信，清透如玉，五顏六色的珊瑚與小丑魚在眼前優游。即便被水母叮、被珊瑚扎傷依然不願離開（這是錯誤示範，被水母叮了務必注意傷勢）。那麼美好的畫面，我想就是這一個月綠島之行最美的紀念品。\n\n從小到大活在都市叢林、從不認為自己真的是外人說的那種「台北俗」的我，在這個走路五小時就能環完的小島裡，真正看見了自己的眼界多渺小。打工換宿不只是換床單洗廁所，更帶我走進一段截然不同的「生活」當中。\n\n如今，我終於能懂為什麼所有去過的人都那樣熱情、那樣激動地推薦我「衝一發」。待在台北或許生活更便利，也不會弄得滿身傷，但這種最無憂無慮的時光，只要試一次，任誰都必定難忘。','2023-08-28 15:53:06');
/*!40000 ALTER TABLE `helpershare` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-08-28 16:00:07
