package com.example.infoapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class DetailActivty extends AppCompatActivity {


    List<BookData> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        loadData();
        int pos = getIntent().getIntExtra("PUT", 0);

        BookData bookData = list.get(pos);

        findViewById(R.id.back).setOnClickListener(v -> finish());

        ((TextView) findViewById(R.id.BookName)).setText(bookData.getBookName());

        ((ImageView) findViewById(R.id.bookImeg)).setImageResource(bookData.getImegResId());

        ((TextView) findViewById(R.id.textBookInfo)).setText(bookData.getBookText());

    }

    private void loadData() {

        list.add(new BookData(R.drawable.kitob1, "C++ dasturlash tili", "Bu maqolamda hozirgi zamonda eng rivojlangan dasturlash tillaridan biri bo'lgan C++ dasturlash tili haqida yozmoqchiman. Bu til tarixi va kelib chiqishi haqida qisqacha yozib, keyingi maqolalarda bu tilda dasturlar tuzishni asta sekinlik bilan o'rgatib o'taman.\n" +
                "\n" +
                "Dastlab UNIX operatsion tizimi va С dasturlash tili yaratilgan va С tili asosida C++ tili yaratildi. С esa o'z navbatida B va BCPL tillaridan kelib chiqgan.\n" +
                "\n" +
                "C++ tilini 80 yillarda AT&T Bell Labs korxonasi ishchisi Byarnom Straustrup tuzgan. Avtorning aytishicha, bu tilni tuzishda u hech qanday qog'ozlarni qoralamagan va hamma ishni yo'l yo'lakay, ketma-ketlikda tuzib chiqqan. Uning asosiy maqsadi, o'zi va do'stlari uchun qulay dasturlash tili yaratishdan iborat edi. C++ dasturlash tilining asosi C hisoblanadi va shu tilni(C) misolida C++ tilini tuzib chiqdi. C dasturlash tilini mukammalashtirgan eng asosiy narsa bu – ob'yektga mo'ljallangan dasturlashni olib kirgani hisoblanadi. Chunki dasturlashda, tez, qulay , tartibli va ixcham yozish uchun ob'yektga mo'ljallangan dasturlash tillaridan foydalanish lozim bo'ladi. Dastlabki C++ dasturlash tilidan foydalanganlar, bu albatta Bell Labs korxonasi hodimlari hisoblanadi.\n" +
                "\n" +
                "1993 yilda bu til ommaga taqdim etildi va C++ nomini oldi. Dastlabki C++ ga oid kitob \"The C++ Programming Language(Addison-Wesley, 1985)\" nomi bilan mashhur bo'ldi va bu kitob 1991 yil \"Язык программирование C++\" tarjimasi bilan rus tiliga tarjima qilindi va bu til(С++) rivojlanishi boshlanib ketdi.\n" +
                "\n" +
                "ANSI-ISO (ANSI X3J16; ISO WG21/N0836) birlashmasi 1989 yilda, birlashga holda ish boshladi. Bu korxonaning dastlabki ishi C++ dasturlash tiliga va uning kutubxonasiga standart ishlab chiqishdan boshlandi. Buning uchun 1990 yildagi C++ tili asos qilib olindi.\n" +
                "\n" +
                "1990 yilda C++ standarti ishlab chiqildi va bu standart hozir ANSI C nomi bilan mashxur. Bu til juda kengayib ketdi va hozirgi kunda bu tilning hamma detallarini biladigan dasturchi bo'lmasa kerak.\n" +
                "\n" +
                "C++ funksiya va ob'yektlarning boy kutubxonasiga ega. Bundan kelib chiqadiki C++ dasturlash tilini o'rganish 2 qismga bo'linadi: dastlab, C++ tili sintaksisi o'rganiladi vv shundan so'ng uning asosiy kutubxonalari birma-bir ko'rib chiqib, yodlash lozim bo'ladi. Bundan ko'rinib turibdiki, bu til juda katta hajmni o'z qamroviga oladi.\n" +
                "\n" +
                "C++ tilining egasi yo'q u hech kimga tegishli emas. Bu til С tilidan kelib chiqgani uchun bosh harf С, ++ esa bu tildagi qiymatni bittaga ko'tarish belgisi hisoblanadi va bu belgi C++ dasturlash tilida paydo bo'ldi.\n" +
                "\n" +
                "C++ dasturlash tili kompilyatsiya qilinadigan til hisoblanadi bu degani yozilgan kod oldin mashina tiliga o'giriladi va keyin ishga tushiriladi."));

        list.add(new BookData(R.drawable.kitob2, "C dasturlash tili", "C dasturlash tili — bu umumiy maqsadli dasturlash tili bo’lib, u mashinalarning ishlashi bilan chambarchas bog’liq. Kompyuter xotirasi qanday ishlashini tushunish C dasturlash tilining muhim jihati hisoblanadi. C ni “o’rganish qiyin” deb hisoblash mumkin bo’lsa -da, C — bu juda sodda til, juda kuchli imkoniyatlarga ega.\n" +
                "\n" +
                "C — bu juda keng tarqalgan til va bu Windows, Python tarjimoni, Git va boshqa ko’plab dasturlarning tili.\n" +
                "\n" +
                "C — bu tuzilgan til, ya’ni uni ishga tushirish uchun kompilyator (masalan, GCC yoki Visual Studio) biz yozgan kodni olishi, uni qayta ishlashi va keyin bajariladigan faylni yaratishi kerak. Bu faylni keyinroq bajarish mumkin va biz dastur uchun mo’ljallangan narsani bajaradi.\n" +
                "\n" +
                "Bizning birinchi dasturimiz\n" +
                "\n" +
                "Har bir C dasturida kerakli funktsiyalarni bajarishga imkon beradigan kutubxonalar ishlatiladi. Masalan, < stdio.h > sarlavhali faylda ekranga chop etiladigan “printf” deb nomlangan eng asosiy funksiya aniqlanadi.\n" +
                "\n" +
                "Printf — buyrug’ini ishga tushirish imkoniyatini dasturimizga qo’shish uchun biz kodning birinchi qatoriga quyidagilarni o’z ichiga olamiz.\n" +
                "\n" +
                "#include <stdio.h>\n" +
                "int main (){\n" +
                "    printf(\"Hello World !\");\n" +
                "return 0;\n" +
                "Kodning ikkinchi qismi — bu biz yozmoqchi bo’lgan haqiqiy kod. Ishlaydigan birinchi kod har doim “ main ya’ni asosiy ” funktsiyada bo’ladi.\n" +
                "\n" +
                "“ Int “ kalit so’zi “ main “ funktsiyasi butun sonni — oddiy sonni qaytarishini ko’rsatadi. Funktsiya qaytariladigan raqam biz yozgan dastur to’g’ri ishlaganligini ko’rsatadi. Agar biz kodimiz muvaffaqiyatli bajarilganligini aytmoqchi bo’lsak, biz 0 raqamini qaytaramiz. 0 dan katta raqam biz yozgan dastur muvaffaqiyatsiz tugaydi.\n" +
                "\n" +
                "E’tibor bering, C dagi har bir so’z nuqta -vergul bilan tugashi kerak, shunda kompilyator yangi bayonot boshlanganini biladi.\n" +
                "\n" +
                "Nihoyat, gapimizni chop etish uchun ” printf “ funktsiyasini chaqirishimiz kerak bo’ladi."));

        list.add(new BookData(R.drawable.kitob3, "C# dashturlash tili", "C# (C-Sharp) - .NET Framework platformasi uchun yaratilgan obyektga yo'naltirilgan dasturlash tili bo’lib, 2000-yilda A.Haylsberg va P.Goldelar tomonidan yaratilgan. C# yaratilishida “har bir mavjud narsa – obyekt hisoblanadi” postulatasiga asos qilingan. Bu dasturlash tilini yaratishda A. Haylsberg va P. Goldelar C++ tilidagi kabi imkoniyatlarni va Java dasturlash tilidagi oddiylik va ko’rinishni birlashtirib yangi dasturlash tili yaratishni maqsad qilganlar va natijada C# dasturlash tili yaratilgan. Bu dasturlash tili o’zgarmas turg’un komponentli arxitekturaga va yuqori saviyadagi xavfsizlik kodiga ega. C # dasturlash tilining C++ va Java dasturlash tillari bilan xarakterli o'xshashlik tomonlarini quyida sanab o’tamiz:\n" +
                "\n" +
                "Java Dasturlash tili bilan\n" +
                "obyekt yo'naltirilganlik (vorislilik)\n" +
                "interfeysi\n" +
                "xatoliklarni bartaraf qilish\n" +
                "ko’p oqimlilik (funksiyalilik)\n" +
                "nomlar\n" +
                "turlar turg’unligi\n" +
                "ko’p masalalik\n" +
                "xavfsizlik kodiga tegishli suzuvchi nuqtaning arifmetik amallari dastur kodini dinamik tiklash\n" +
                "С++ dasturlash tili bilan o’xshash tomonlari:\n" +
                "ko’p operatorlilik\n" +
                "xavfsizlik kodiga tegishli suzuvchi nuqtaning arifmetik amallari dastur kodini dinamik tiklash\n" +
                "soddalilik\n" +
                "ko`p komponentalilik\n" +
                "tushunarli interfeysi\n" +
                "Bugungi kunda C# dasturlash tili IT sohasidagi eng kuchli, tez rivojlanayotgan va talabga javob beradigan tillardan biri hisoblanadi. Hozirgi vaqtda unda turli xil dasturlar yozilgan: kichik stol dasturlaridan tortib to har kuni millionlab foydalanuvchilarga xizmat ko'rsatadigan yirik veb-portallar va veb-xizmatlar.\n" +
                "\n" +
                "Endi biz C# dasturlash tilida birinchi dasturimizni quramiz.\n" +
                "\n" +
                "namespace Kirish\n" +
                "{\n" +
                "   internal class Program\n" +
                "   {\n" +
                "       static void Main(string[] args)\n" +
                "       {\n" +
                "           Console.WriteLine(\"Hello, World! UzbekDevs\");\n" +
                "       }\n" +
                "   }\n" +
                "}"));
        list.add(new BookData(R.drawable.kitob4, "Java dasturlash tili", "Assalomu alaykum bugun siz bilan Java haqida uning mazmuni haqida gaplashib olamiz! Java bu dasturlash tili hisoblanib. Ko'p qo'llanilib kelinayotgan dasturlash tillaridan biri hisoblanadi. Java dasturlash tilida mobile, desktop, web, o'yinlar va ko'pgina imkoniyatlari mavjud.\n" +
                "\n" +
                "Java va JavaScript boshqa boshqa dasturlash tili hisoblanadi!\n" +
                "Biz siz bilan hozir Java kodni ko'ramiz! Bu kodga keyinroq kengroq to'xtalib o'tamiz!\n" +
                "\n" +
                "public class MyClass {\n" +
                "  public static void main(String[] args) {\n" +
                "    System.out.println(\"Hello World, MasterSherkulov\");\n" +
                "  }\n" +
                "}\n" +
                "Java - 1995 yilda yaratilgan eng mashxur dasturlash tillaridan biri hisoblanadi. Java dasturlash tili Oracle ga tegishli hisoblanadi.\n" +
                "\n" +
                "Java dasturlash tilida nima qila olishimiz mumkin!?\n" +
                "\n" +
                "Mobile ilovalar. Android OT uchun ilovalar yaratish.\n" +
                "Desktop dasturlar yaratish imkoniyati\n" +
                "Web Saytlar\n" +
                "Web serverlar va Dastur Serverlari\n" +
                "O'yinlar\n" +
                "Ma'lumotlar bazasiga ulanish\n" +
                "Bundanda ko'proq imkoniyatlar ... (etc)\n" +
                "Java dasturlash tilini nima uchun tanlashimiz kerak!?\n" +
                "\n" +
                "Java turli xil platformalarda ishlaydi.\n" +
                "Java dasturlash tili dunyodagi eng mashxur dasturlash tillaridan biridir.\n" +
                "O'rganish va undan foydalanish. Sherigingiz yozgan kodga tushunib ketish juda oson.\n" +
                "Bu ochiq va bepul.\n" +
                "Java dasturlash tili xavfsiz kuchli va tezkor hisoblanadi.\n" +
                "Java dasturlash tili katta jamoatchilik tamonidan qo'llab quvvatlanmoqda!\n" +
                "Java bu obyektga yo'naltirilgan dasturlash tili bo'lib. GUI dasturlarni ishlash va taxrir qilish imkoniyatini beradi!\n" +
                "Java dasturlash tili C++ va C# dasturlash tillariga yaqin bo'lganligi sababli, dasturchilar Java yoki aksincha C++ va C# dasturlash tillariga o'tishda qiyinchilik to'gdirmaydi.\n" +
                "Keyin darsliklarimizda Biz siz bilan Java dasturlash tiliga ko'proq to'xtalib o'tamiz!\n" +
                "\n" +
                "Java ishlari\n" +
                "Java talab juda yuqori veb va mobil ilovalarini ishlab chiqish uchun Java dasturchilarni yollashmoqda.Quyida Java-dan foydalanayotgan yirik kompaniyalar va ularga yaxshi Java dasturchilari kerak:\n" +
                "Java bir marta yoziladi, istalgan joyda ishga tushiriladi.\n" +
                "\n" +
                "Ob'ektga yo'naltirilgan - Java-da hamma narsa ob'ektdir. Java osongina kengaytirilishi mumkin, chunki u Ob'ekt modeliga asoslangan.\n" +
                "Platformadan mustaqil - C va C++ kabi ko'plab boshqa dasturlash tillaridan farqli o'laroq, Java kompilyatsiya qilinganda, u platformaga xos mashinaga emas, balki platformadan mustaqil bayt kodiga kompilyatsiya qilinadi. Ushbu bayt kodi internet orqali tarqatiladi va qaysi platformada ishlayotgan bo'lishidan qat'i nazar Virtual Mashina (JVM) tomonidan talqin qilinadi.\n" +
                "Oddiy - Java o'rganish oson bo'lishi uchun yaratilgan. Agar siz Java OOP ning asosiy tushunchasini tushunsangiz, uni o'zlashtirish oson bo'ladi.\n" +
                "Xavfsiz - Java-ning xavfsiz xususiyati bilan u virussiz, buzg'unchiliksiz tizimlarni ishlab chiqish imkonini beradi. Autentifikatsiya usullari ochiq kalitlarni shifrlashga asoslangan.\n" +
                "Arxitektura-neytral - Java kompilyatori arxitektura-neytral ob'ekt fayl formatini yaratadi, bu esa kompilyatsiya qilingan kodni Java ish vaqti tizimining mavjudligi bilan ko'plab protsessorlarda bajariladigan qiladi.\n" +
                "Portativ - arxitektura-neytral bo'lish va spetsifikatsiyaning amalga oshirishga bog'liq jihatlari yo'qligi Java-ni portativ qiladi. Java-dagi kompilyator ANSI C-da POSIX kichik to'plami bo'lgan toza portativlik chegarasi bilan yozilgan.\n" +
                "Mustahkam − Java asosan kompilyatsiya vaqtidagi xatolarni tekshirish va ish vaqtini tekshirishga e'tibor qaratib, xatolarga moyil vaziyatlarni bartaraf etishga harakat qiladi.\n" +
                "Multithreaded - Java-ning ko'p tarmoqli xususiyati bilan bir vaqtning o'zida bir nechta vazifalarni bajara oladigan dasturlarni yozish mumkin. Ushbu dizayn xususiyati ishlab chiquvchilarga muammosiz ishlashi mumkin bo'lgan interaktiv ilovalarni yaratishga imkon beradi.\n" +
                "Interpreted - Java bayt kodi tezda mahalliy mashina ko'rsatmalariga tarjima qilinadi va hech qanday joyda saqlanmaydi. Rivojlanish jarayoni tezroq va analitikdir, chunki ulanish bosqichma-bosqich va engil jarayondir.\n" +
                "Yuqori unumdorlik - Just-In-Time kompilyatorlaridan foydalangan holda Java yuqori ishlash imkonini beradi.\n" +
                "Taqsimlangan - Java Internetning taqsimlangan muhiti uchun mo'ljallangan.\n" +
                "Dinamik - Java C yoki C++ ga qaraganda dinamikroq hisoblanadi, chunki u rivojlanayotgan muhitga moslashish uchun mo'ljallangan. Java dasturlari ish vaqtida ob'ektlarga kirishni tekshirish va hal qilish uchun ishlatilishi mumkin bo'lgan keng ko'lamli ish vaqti ma'lumotlarini olib yurishi mumkin.\n" +
                "Sizga kerak bo'ladigan qurilma\n" +
                "Ushbu qo'llanmada ko'rib chiqilgan misollarni bajarish uchun sizga kamida 128 MB operativ xotiraga ega 300 MGts chastotali Pentium kompyuter kerak bo'ladi (256 MB RAM tavsiya etiladi).\n" +
                "\n" +
                "Shuningdek, sizga quyidagi dasturlar kerak bo'ladi -\n" +
                "\n" +
                "Linux 7.1 yoki Windows xp/7/8 operatsion tizimi\n" +
                "Java JDK 8\n" +
                "Microsoft Notepad yoki boshqa matn muharriri\n" +
                "Ushbu qo'llanma Java-dan foydalangan holda GUI, tarmoq va veb-ilovalarni yaratish uchun kerakli ko'nikmalarni beradi."));
        list.add(new BookData(R.drawable.kitob5, "JavaScript dasturlash tili", "JavaScript dasturlash tili interaktiv saytlar tuzish uchun ishlab chiqilgan. Uni alohida .js kengaytmali faylda saqlanadi va sahifa bilan birgalikda ishga tushiriladi. HTML faylda JavaScript faylni ulash uchun maxsus quyidagicha teg yoziladi:\n" +
                "\n" +
                "<script src=\".js fayl manzili\"></script>\n" +
                "\n" +
                "Odatda skriptlar sahifaning eng quyi qismiga ya’ni </body> tegi oldidan ulash amalga oshiriladi.\n" +
                "\n" +
                "JavaScript’da dasturlash — brauzer nima ishlar bajarishi kerak ekanligini ko’rsatib beruvchi qo’llanmalar ketma-ketligi. Ushbu qo’llanmalar ham o’z vaqtida tepadan pastga qarab ketma-ketlikda amalga oshiriladi.\n" +
                "\n" +
                "JavaScript’da biror bir qo’llanma yakunlanganini bildirish uchun satr s’nggi nuqta vergul qo’yiladi va keyingi sahifaga o’tiladi. Nuqta vergul belgisini yozmasdan yangi sahifaga o’tish orqali ham qo’llanma yakunlanganini bildirish mumkin. Ammo bu usul har doim ham ishlayvermaydi. Shuning uchun nuqta vergul qo’yish maqsadga muvofiq\n" +
                "\n" +
                "JavaScript HTML faylda yozilgan kodlarni o’zgartirish imkoniyatiga ega emas, lekin u brauzerda foydalanuvchiga ko’rinadigan qismini o’zgartirib beradi.\n" +
                "\n" +
                "Izohlar (kommentlar)\n" +
                "Kommentlar — bu kodni tushunishga yordam beruvchi qo’shimcha izohlar hisoblanadi. U brauzerda ko’rinmaydi va dastur ishlashi uchun hech qanday ta’sir o’tkazmaydi. Komment ichidagi qo’llanmalar ishlamasligi uchun uni ko’proq kodning ma;lum bir qismini o’cirib turish uchun foydalaniladi.\n" +
                "\n" +
                "JavaScript’da ikki xil komment ko’rinishi mavjud:\n" +
                "\n" +
                "// Bir satrli komment.\n" +
                "\n" +
                "/*\n" +
                "\n" +
                "Ko'p satrli.\n" +
                "\n" +
                "Uning yordamida bir vaqtda bir nechta satr kodlarini o'chirib qo'yish imkoni mavjud.\n" +
                "\n" +
                "*/\n" +
                "\n" +
                "querySelector metodi\n" +
                "Sahifadagi biror bir elementni izlab topish uchun querySelector metodidan foydalanladi. U selektor bo’yicha qidirish imkonini beradi:\n" +
                "\n" +
                "document.querySelector('селектор');\n" +
                "\n" +
                "Bu qo’llanma ikki qismdan iborat: Birinchisi — JavaScript izlashi kerak bo’lgan element. document so’zi skript ulangan veb-sahifa nazarda tutiladi. Umuman olganda, sahifa nomi qanday ekanligining umuman qizig’i yo’q JavaScript uni “hujjat” sifatida tushunadi. U sahifadagi istalgan element uchun ota element hisobalanadi.\n" +
                "\n" +
                "Qo’llanmaning ikkinchi qismi — nima qilish kerak ekanligi. Uning nomini metod deb qo’yamiz.\n" +
                "\n" +
                "Konsol\n" +
                "Konsol — tuzuvchi yozgan kodlarini test qilishi mumkin bo’lgan uskuna. Agarda skriptni ishga tushirish vaqtida biror bir xatolik yuzaga kelsa, u haqida konsolda ma’lumot beriladi. Shuningdek, konsolda matnli eslatmalarni chiqarishda ham qo’llaniladi. Konsolda xabar chiqarish uchun console.log kalit so’zidan foydalanamiz:\n" +
                "\n" +
                "console.log('JavaScriptdan salom!');\n" +
                "\n" +
                "// Konsoldagi xabar: JavaScriptdan salom!\n" +
                "\n" +
                "console.log(document.querySelector('.page'));\n" +
                "\n" +
                "// Konsolda izlab topilgan element hosil boladi\n" +
                "\n" +
                "O’zgaruvchi\n" +
                "O’zgaruvchi — ma’lumotlarni ularga tushunarli nom berish yordamida saqlab olish.\n" +
                "\n" +
                "O’zgaruvchilarni tuzish yoki e’lon qilish uchun let kalit so’zidan foydalaniladi. Undan keyin o’zgaruvchiining nomi keladi. O’zgaruvchi e’lon qilinganidan keyin unga qiymat berilishi kerak bo’ladi:\n" +
                "\n" +
                "let header = document.querySelector('header');\n" +
                "\n" +
                "O’zgaruvchi nomini istalgan nom bilan berishingiz mumkin ammo ular sonlar bilan boshlanmasligi va maxsus ‘_’ va ‘$’ belgilaridan boshqa belgilardan foydalanish mumkin emas. Shuningdek o’zgaruvchilarga nom berishda maxsus ro’yxatdagi so’zlardan foydalanish mumkin emas. O’zgaruvchilarning nomlari katta va kichik harflar bilan yozishga ham e’tibor beriladi: header, Header va HEADER — bular turli xil o’zgaruvchilar hisoblanadi. O’zgaruvchi nomi unda qanday ma’lumo saqlanayotgan bo’lsa shuni anglatishi kerak.\n" +
                "\n" +
                "Brauzer o’zgaruvchi nomini ko’rgan vaqtda uning qiymatini oladi.\n" +
                "\n" +
                "let kalit so’zi JavaScript’da 2015 yilda paydo bo’lgan, bungacha o’zgaruvchilarni e’lon qilishda var kalit so’zi ishlatilgan.\n" +
                "\n" +
                "Klasslarni o’zgartirish uchun metodlar\n" +
                "Elemetlardan klassni o’chirishda classList.remove metodi ishlatiladi. U elementda qavs ichida keltirilgan klassni o’chirib yuboradi:\n" +
                "\n" +
                "элемент.classList.remove('класс');\n" +
                "\n" +
                "Elementlarga klass qo’shish uchun esa classList.add metodidan foydalaniladi:\n" +
                "\n" +
                "элемент.classList.add('класс');\n" +
                "\n" +
                "Almashtiruvchi metod hisoblangan classList.toggle metodi ko’rsatilgan klass elementda mavjud bo’lsa o’chiradi, mavjud bo’lmasa uni qo’shadi:\n" +
                "\n" +
                "элемент.classList.toggle('класс');\n" +
                "\n" +
                "textContent hususiyati\n" +
                "Har bir elementning bir nechta hususiyatlari mavjud: o’lchami, rangi va bosqa. textContent hususiyati elementning matni tarkibini o’zida saqlaydi. Ushbu hususiyatga boshqa qimat berish imkoni ham mavjud:\n" +
                "\n" +
                "let paragraph = document.querySelector('p');\n" +
                "\n" +
                "paragraph.textContent = 'Здесь был Рекс. Вов!';\n" +
                "\n" +
                "value hususiyati\n" +
                "Kiritish maydonlarini asosiy hususiyati — value hisoblanadi. U matn maydoniga kiritlgan ma’lumotlarni o’zida saqlaydi. Biz ularni to’g’ridan-to’g’ri sahifada namoyon qilishimiz mumkin:\n" +
                "\n" +
                "let input = document.querySelector('input');\n" +
                "\n" +
                "paragraph.textContent = input.value;\n" +
                "\n" +
                "Konkatenatsiya\n" +
                "Bir nechta qiymatlarni bir-biriga “yopishtirish” amali konkatenatsiya deb atalib, bu amal JavaScript’da ‘+’ beligisi yordamida amalga oshiriladi.\n" +
                "\n" +
                "let name = 'Рекс';\n" +
                "\n" +
                "paragraph.textContent = 'Sizning ismingiz ' + name + '. Xayrli kun!';\n" +
                "\n" +
                "console.log(paragraph.textContent);\n" +
                "\n" +
                "// Natija: Sizning ismingiz Reks. Xayrli kun!\n" +
                "\n" +
                "Voqealarni amalga oshiruvchi onclick va onsubmit\n" +
                "JavaScript sahifada yuz berayotgan barcha voqealarni kuzatib turadi. Biror bir tugmani bosishimiz yoki forma yuborishimiz — voqea deyiladi. Biz ba’zi islar bo’’lganda JavaScript nima qilishi kerakligini belgilab berishimiz mumkin. Bunda bizga voqealarni amalga oshiruvchilar yordam beradi. Biror hodisa yuz berganda bajarilishi kerak bo’lgan ishlar ro’yxati figurali qavslar ichida keltiriladi.\n" +
                "\n" +
                "onclick hususiyati biror nimani “bosish”ni bildiradi:\n" +
                "\n" +
                "let button = document.querySelector('button');\n" +
                "\n" +
                "button.onclick = function() {\n" +
                "\n" +
                "console.log('Tugma bosildi!');\n" +
                "\n" +
                "};\n" +
                "\n" +
                "Tugmani har bir bosganimizda konsolda Tugma bosildi! degan xabar paydo bo’ladi.\n" +
                "\n" +
                "Formani yuborish uchun onsubmit hususiyati mas’ul hisoblanadi:\n" +
                "\n" +
                "let form = document.querySelector('form');\n" +
                "\n" +
                "form.onsubmit = function() {\n" +
                "\n" +
                "console.log('Forma yuborildi!');\n" +
                "\n" +
                "};\n" +
                "\n" +
                "Forma yuborilganidan keyin konsolda Forma yuborildi! degan xabar paydo bo’ladi."));

        list.add(new BookData(R.drawable.kitob6, "Kotlin dasturlash tili", "Kotlin Java Virtual Machine (JVM) da ishlaydigan ochiq manbali statik tarzda yozilgan dasturlash tilidir. U obyektga yo’naltirilgan dasturlashni (OOP) va funktsional dasturlashni cheklanmagan, o’zini o’zi ta'minlaydigan va o’ziga xos platformalarda birlashtiradi. Shuningdek, u miniatyura kodlari bilan funksiyalarni birlashtirishga imkon beradi. Kotlin - bu JetBrains tomonidan ishlab chiqilgan umumiy maqsadli dasturlash tili.\n" +
                "\n" +
                "Kotlin tarixi\n" +
                "2016-yil - Kotlin v1.0 ishga tushirildi\n" +
                "2017-yil - Googlening Androidda kotlinni birinchi darajali qo’llab-quvvatlashi haqida e'lon.\n" +
                "2018-yil - Kotlin v1.2 JVM va JavaScript o’rtasida kodlarni tarqatish bo’yicha qo’shimchalar bilan birga keladi.\n" +
                "2019-yil - Google Kotlinni Android ilovalarini ishlab chiquvchilar uchun afzal ko’rgan dasturlash tili sifatida e'lon qildi.\n" +
                " 2021-yil 20-sentabrda Kotlin v1.5.31 ishga tushirildi.\n" +
                "Kotlindan foydalanish sabablari\n" +
                "Kotlin nima uchun keng qo’llanilishining ba’zi muhim sabablari:\n" +
                "\n" +
                "Kotlin - bu o’qish va yozish juda oson bo’lgan statik tarzda yozilgan til.\n" +
                "Kotlin dasturlari o’z dasturida nuqta, vergulni talab qilmaydi. Bu kodni oson va o’qishni osonlashtiradi.\n" +
                "Ushbu til Javadan turli usullarda ma'lumot almashish va foydalanish imkonini beradi. Bundan tashqari, Java va Kotlin kodi bitta loyihada birga bo’lishi mumkin.\n" +
                "Kotlin tipidagi tizim koddan NullPointerExceptionni yo’q qilishga qaratilgan.\n" +
                "Kotlinda yangi kod yozish uchun sizga kamroq vaqt kerak bo’ladi. Kotlin kodini joylashtirish va uni miqyosda saqlash yanada oson.\n" +
                "Kotlinning xususiyatlari\n" +
                "Bu yerda Kotlinning bir nechta xususiyatlari dasturlash tilining rivojlanish yo’liga ishonch hosil qiladi.\n" +
                "\n" +
                "1.Kesilgan kodlash:\n" +
                "\n" +
                "Kotlin – bu OOPga asoslangan dasturlash tili bo’lib, kod qatorini 40% gacha qisqartirish mumkin, bu esa Kotlinni dasturiy ta’minot yoki veb-ishlab chiqish uchun ideal tanlov qiladi.\n" +
                "\n" +
                "2.Ochiq manba:\n" +
                "\n" +
                "Android uchun Kotlin JVM dan foydalanadi va OOP va funktsional yo’naltirilgan dasturlash xususiyatlarini birlashtiradi.\n" +
                "\n" +
                "3.Tez kompilatsiya:\n" +
                "\n" +
                "Kotlin bilan ishlashda kodni kompilyatsiya qilish oson, bu esa androidni ishlab chiqishda yaxshiroq ishlashga olib keladi, shuningdek, butun kodda qaysi turdagi ma'lumotlar funksiyasidan foydalanish mumkinligini tushuntiradi.\n" +
                "\n" +
                "4.Kengaytma funksiyalari:\n" +
                "\n" +
                "Kotlin kodga hech qanday o’zgartirish kiritmasdan turli xil kengaytma funktsiyalarini qo’llab-quvvatlashi mumkin. Bu mavjud kodni ishlab chiquvchilar uchun yanada jozibali va ajoyib qilishda yordam beradi.\n" +
                "\n" +
                "5.Null xavfsizlik:\n" +
                "\n" +
                "Kotlinda tizim quyida keltirilgan Kotlin misolida ko’rsatilganidek, null havolalarni emas, balki null havolalarni ajratadi.\n" +
                "\n" +
                "Masalan, String o’zgaruvchisi nullni ushlab turolmaydi:\n" +
                "\n" +
                "Var string1: String = \"Bugun yakshanba\"\n" +
                "String1 = null // kompilyatsiya xatosi\n" +
                "Nullga ruxsat berish uchun biz null o’zgaruvchiga qo’shilishimiz mumkin:\n" +
                "\n" +
                "Var string2: String? = \"Bugun yakshanba\"\n" +
                "String2 = null\n" +
                "chop etish (string2)\n" +
                "6.Birgalikda ishlash mumkin:\n" +
                "\n" +
                "Kotlin kodi Java tomonidan ishlatilishi mumkin, Java kodlari esa Kotlin bilan ishlatilishi mumkin. Shunday qilib, agar siz OOP dasturlash haqida ma'lumotga ega bo’lsangiz, Kotlinning rivojlanishiga o’tish oson. Bundan tashqari, Javada yozilgan ba’zi ilovalar mavjud bo’lsa, ular Kotlin muhitida ishlatilishi mumkin.\n" +
                "\n" +
                "7.Kuchli asboblar:\n" +
                "\n" +
                "Java singari, Kotlin kodi ham IDE yoki buyruq qatori interfeysi yordamida yozilishi mumkin. IDE bilan ishlash oson va sintaktik xatolar ham keskin kamayadi. Shu bilan birga, buyruq qatori interfeysi bilan ishlayotganingizda, avval kodni kompilyatsiya qilish kerak.\n" +
                "\n" +
                "8.Smart Cast:\n" +
                "\n" +
                "Smart casting asosan dastur xarajatlarini kamaytirishga yordam beradi va uning tezligi yoki ish faoliyatini yaxshilaydi. U turdagi casting yoki o’zgarmas qiymatlar yordamida kod samaradorligini boshqarish ustida ishlaydi.\n" +
                "\n" +
                "Masalan, agar satr aniqlansa, u holda uning uzunligi va soni va Smart Cast funksiyasi yordamida topish mumkin:\n" +
                "\n" +
                "Val string1: Any = \"Bugun dushanba\"\n" +
                "qachon(string1)\n" +
                "{\n" +
                "bu String -> string1.length\n" +
                "Int -> string1.inc()\n" +
                "}\n" +
                "Kotlin arxitekturasi\n" +
                "Yaxshi qurilgan arxitektura dastur uchun o’z xususiyatlarini kengaytirish va oxirgi foydalanuvchi bazasining talablarini qondirish uchun muhimdir. Kotlin xotirani taqsimlash va ishlab chiquvchilar va oxirgi foydalanuvchilar uchun sifatli natijalarga erishish uchun o’ziga xos va o’ziga xos arxitekturaga ega.\n" +
                "\n" +
                "Kotlinning koroutinlari va sinflari yadroni kamroq kod ishlab chiqarish, unumdorlikni oshirish va samaradorlikni kuchaytirish uchun arxitektura qiladi. Kotlin kompilyatori har xil munosabatda bo’lishi mumkin bo’lgan turli xil ssenariylar mavjud, ayniqsa u har xil tillarni maqsad qilganda."));

        list.add(new BookData(R.drawable.kitob7, "Python dasturlash tili", "Python nima?\n" +
                "\n" +
                "Python - mashhur dasturlash tili. U Guido van Rossum tomonidan 1991 yilda ishlab chiqilgan.\n" +
                "\n" +
                "Bu dasturlash tili o'rganish uchun oson, foydalanish uchun qulay, ko'p qirrali dasturlash tili bo'lib, dasturlashga yangi kirganlar uchun ham, soha mutaxassislari uchun ham zo'r tanlov.\n" +
                "\n" +
                "Python quyidagilar uchun ishlatiladi:\n" +
                "\n" +
                "veb-ishlab chiqish (server tomonida),\n" +
                "dasturiy ta'minotni ishlab chiqish,\n" +
                "matematik amallar,\n" +
                "tizim skriptlari.\n" +
                "Bu dasturlash tilida nimalar qilishi mumkin?\n" +
                "\n" +
                "Python serverda veb-ilovalar ishlab chiqish uchun ishlatilinishi mumkin.\n" +
                "Python ish oqimlarini yaratish uchun dasturiy ta'minot bilan bir qatorda ishlatilishi mumkin.\n" +
                "Python ma'lumotlar bazasi tizimlariga ulanishi mumkin. Bundan tashqari, u fayllarni o'qishi va o'zgartirishi mumkin.\n" +
                "Python katta ma'lumotlarga ishlov berish va murakkab matematikani bajarish uchun ishlatilishi mumkin.\n" +
                "Pythonni tezkor prototiplash yoki ishlab chiqarishga tayyor dasturiy ta'minotni ishlab chiqish uchun ishlatish mumkin.\n" +
                "Nima uchun aynan Python?\n" +
                "\n" +
                "Python turli xil platformalarda ishlaydi (Windows, Mac, Linux, Raspberry Pi va boshqalar).\n" +
                "Python ingliz tiliga o'xshash oddiy sintaksisga ega.\n" +
                "Python dasturlash tiliga bo'lgan talab yildan yilga oshib kelmoqda. CodingDojo portalining tadqiqotlariga ko'ra, 2020 yilda aynan Python tilida dasturlovchi mutaxassislarga eng ko'p talab bo'lgan.\n" +
                "Python Artificial Intelligence (Sun'iy intellekt) va Data Science (Ulkan ma'lumotlar bilan ishlash) sohalarining tili hisoblanadi. Bugungi kunda keng ommalashib borayotgan sun'iy intellekt asosida ishlovchi dasturlarning aksari Pythonda yozilgan. Bu sohalardagi mutaxassislar bugungi kunda eng noyob va qimmatbaho kadrlar hisoblanadi.\n" +
                "Keng qamrovli va universal til. Python dasturlari deyarli barcha operativ tizimlarda va platformalarda ishlaydi.\n" +
                "O'rganish uchun ham, tushunish uchun ham juda qulay va sodda kod.\n" +
                "Moslashuvchanlik —Python dasturlash tili ma'lum bir masalalarni yechish bilan chegaralanmagan. Bu til dasturchilarga yangi va yangi yo'nalishlarga ki'rish imkonini beradi. Python quyidagi sohalarda qo'llaniladi: Web va Internet dasturlash, kompyuter o'yinlarini yaratish, ma'lumotlar bazasi bilan ishlash (DB), computer vision, foydalanuvchilar uchun grafik interfeys (GUI), juda tez rivojlanayotgan buyumlar interneti (IoT) texnologiyasi va hokazo."));

        list.add(new BookData(R.drawable.kitob8, "PHP dasturlash tili", "PHP – keng tarqalgan umumiy maqsadli dasturlash tilidir. Qisqacha aytganda PHP veb – serverda ishlaydigan veb-ilovani (skriptlarni) yozish uchun maxsus mo’ljallangan dasturlash tili hisoblanadi. PHP degan manoni anglatadi. Tilning sintaksisi C, Java PerlPhysics dan kelib chiqadi. PHP ning afzalligi veb- ishlab chiqaruvchilar tezda dinamik ravishda yaratilgan veb-sahifalarni yaratish qobiliyatidir. PHP ning Perl va S kabi tillari oldida muhm ustinligi PHP buyruqlari bilan HTML hujjatlarni yaratish qobiliyatidir . PHPga mijozlar tamonida masalan, javascriptda ishlaydigan har qanday koddan PHP uchun muhim farq PHP skriptlari server tomonidan amalga oshiriladi. Hatto serveringizni HTML fayillari PHP prosessori tomonidan qayta ishlangan tarzda sozlashingiz mumkin, bunda mijozlar normal HTML fayli yoki skriptni ishga tushirish natijasi haqida ma’lumotga ega bolmaydilar. PHP sizni juda qisqa vaqt ichida yuqori sifatli veb ilovalarni yaratishga kelgusida asonlikk bilan ozgartiriladigan va qollab quvatlanadigan mahsulotni yaratishga imkon beradi. PHP organish oson va ayni paytda professionall dasturchilar talablarini qondira oladi. PHP haqida birinchi eshitgan bolsangiz ham ushbu tilni organish siz uchun qiyin bolmaydi. Shubha yoqki PHP asoslarini bir necha soat ichida organganingizdan song siz oddiy PHP skriptlarini yaratishingiz mumkin. PHP tili doimiy ravshda takomillash boradi va albatta yaqin kelajakda veb dasturlash tillari sohasida uzoq vaqt hukumronlik qiladi. PHP (o’qilishi “Pi Eych”)- Script tili bo’lib Web Serverda ozgaruvchan HTML fayillarini yaratishda qollaniladi. Hozirgi kunda deyarli barcha hosting provayderlar mazkur tilni qo’llab quvvatlaydi. Odatda, PHP ma’lumotlar bazasi bilan ishlatiladi . PHP GNU GPL litsenziyasi orqali tekin tarqatialdi. PHP dasturlash tili orqali siz dinamik web saytlar dasturlar boshqaruv tizimlari shunga o’xshash narsalarni tuzsangiz bo’ladi . HTML orqali o’zgarmas saytlar tuzilsa PHP orqali o’zgaruvchan mukammal saytlar tuzishingiz mumkin. Turli komplyatorlar orqali mobill hamda kompyuter dasturlarini tuzsa ham boladi. <\n" +
                "> - degan edi uning yaratuvchisi. Birinchi navbatda PHP tili server tomonidan bajariladigan skriptlar yaratish uchun foydalaniladi va aynan shuning uchun u yartilgan. PHP tili ixtiyoriy CGI-skriptlari masalalarini yechishga va bundan tashqari HTML formali maluymotlarni qayta ishlashga hamda dinamikk ravisha html sahifalarini ishlab chiqishga qodir. Biroq PHP tili foydalaniladigan boshqa sohalar ham mavjud. Bu sohalarni biz 3-asosiy qismga bolamiz: 1-soha biz yuqorida aytib otganimizdek server tomonidan bajariladigan ilovalar (skriptlar) yaratish. PHP tili bunday turdagi skriptlarni yaratish uchun juda keng qollaniladi. Bunday ish korsatish uchun PHP – parser (PHP – skriptlarini qayta ishovchi) va skriptlarni qayta ishlovchi veb server skriptlarini natijasini korish uchun brovzer va albatda PHP kodini yozish uchun qanday bo;lsa ham matn muhariri kerak bo’ladi. PHP - parser CGI dasturlash yoki server modullari ko’rinishida tarqalgan. Uni va veb serverni kompyuterimizga qanday o’rnatamiz biz bu haqda keyinroq ko’rib o’tamiz. 2- soha buruqlar satrida bajariladigan skriptlarni yaratish . Yani PHP tili uordamida biror bir kompyuterda brauzer va veb serverlardan mustaqill ravishda o’zi bajaradiga skriptlarni ham yaratish mumkin. Bu ishlarni bajarish uchun hech bo;lmaganda PHP parser (bu holatda biz uni buyruqlar satri interpretatori (CLI command line interpreter) deb ataymiz ) talab etiladi. Bunday ishlash uslubi turli masalalarni rejalashtirish yordamida bajarilishi uchun kerak bo’lgan skriptlar yoki oddiy matnni qayta ishlash uchun kerak bo’lgan masalaga o’xshash ishlaydi. 3-soha bu mijoz tomonidan bajariladigan GUI – ilovalarini - grafik interfeys yaratish. Bu soha PHP tilini endigina o’rganayotgan foydalanuvchilar uchun uncha muhim bo’lmagan sohadir biroq agarda siz PHP tilini chuqur o’rgangan bo’lsangiz bu soha siz uchun ancha muhimdir. PHP tilini bu sohaga qo’llash uchun php kengaytmali mahsus yordamchi - PHP – GTK talab etiladi. Shunday qilb PHP tilini qo’llanilishi keng va turlichadir. Yuqoridagi masalalarni yecha oladigan boshqa turlicha dasturlash tillari ham mavjud unda nima uchun PHP tilini o’rganishimiz kerak ? u til bizga nima beradi ? birinchidan PHP tili o’rganish uchun juda qulay . PHP tilini sintaksisi asosiy qoiydalari va ishlash prinsipi bilan yetarlicha tanishib chiqib o’zingizni shaxsiy dasturingizni tuzib ko’rib so’ngra uni boshqa dasturlash tillarida tuzilgan variantlari bilan solishtirsangiz bunga guvoh bo’lasiz. Ikkinchidan PHP tili barcha bizga ma’lum platfo’rmalarda barcha operatsion tizimlarda hamda turlicha serverlarda erkin ishlay oladi . Bu xususiyat juda muhum. Masalan kimdir Windows operatsion tizimdan Linux operatsion tizimga yoki IIS serverdan Apachi serverga o’tmoqchi bo’lsa PHP tili o’rganish shart. PhP dasturlash tilida dasturlashning ikkita hamma bop porodikmalari ishlatiladi bular protsedurali va obektli dasturlash . PHP4 dasturlash tili protsedurali dasturlashni butunlay qo’llab quvvatlaydi biroq abektli stildagi dasturlarni hamm qo’llasa bo’ladi . Php 5 dasturlash tilining birinchi testlash versiyasida PHP 4 dasturlash tilida uchraydugan abekitga yo’naltirilgan dasturlash modellarining kamchiliklari to;ldirilgan. Shunday qilib hozirda tanish bo’lib ulgurgan ishlash prinsipini tanlash kerak . Agarda PHP tilini hozirgi imkoniyatlari to’g’risida gaplashadigan bo’lsak u holda biz PHP tilini birinchi versiyadan ancha yiroqlashb ketgan bo’amiz. PHP dasturlash tili yordamida tasvirlar PDF faylar flesh ro’liklar yaratish mumkin: hozirgi vaqtdagi zomonaviy ma’lumotlar bazasini qo’llab quvatlaydi: ixtiyoriy matnli fayl formatlari bn hamda XML va fayllar tizimi bilan ishlaydigan funksiyalar ham qo’shilgan. PHP tili turli servislar o’rtasidagi protokollarning o’zaro aloqasini qo’llab quvatlaydi. Bularga misol papkalarga kirishni boshqarish protokoli LDAP tarmoq qurilmalari bilan ishlaydigan protokol SNMP malumotlarni uzatish protokollari IMAP , NNTP hamda POP3 , giper matnlarni uzatish protokoli HTTP va boshqalarni olish mumkin. PHP dasturlash tilini turli dasturlash tillari o’rtasidagi o’zaro aloqasiga diqqatni qaratsak bunga Java dasturlash tilini aytib o’tish kerakki Java dasturlash tili obekitlarini PHP tili o’z abekitlari sifatida qaraydi . Abektlarga murojat sifatida CORBA kengaytmasidan foydalaniladi . Matnli oxborotlar bilan ishlash uchun PHP tili o’ziga Perla dasturlash tilidagi tartiblangan ifodalar bilan ishlay oladigan mexanizmlarni (katta bo’lmagan o’zgarishlarsiz) va UNIX tizimini meros qilb oladi . XML hujjatlarni qayta ishlash uchun standart sifatida DOM va SAX XSLT – transformatsiyasi uchun API dan foydalanish mumkin. Elektro’n tijorat ilovalarni yaratish uchun bir qator to’lovni amalga oshiradigan Cybercash , CyberMUT, Verisign Payflow Pro hamda CCVS kabi foydali funksiyalar mavjud.\n" +
                "Asosiy kursning amaliyoti sifatida ishlanadigan masalalar mos ravishda sikriptlar yaratilishida qo’llanilishi sercverlarni qayta ishlash. Bular uchun bizga Web server hamda PHP tili interpretatori kerak bo’ladi. Web server sifatida masalan veb mutaxasislari o’rtasida mashxur bo’lgan Apache serverini olamiz . Dastur natijasini ko’rish uchun veb brouzer kerak bo’ladi bunga misol internet EXPLORER. Biz yuqorida Linux va Windovs plotformalari uchun PHP dasturiy vositasini sozlash va o’rnatish bilan yetarlich tanishmiz. PHP dasturiy vositasi va uni ishlashi uchun kerak bo’ladigan komponetlarni o’rganishni xoxlamaydiganlar uchun PHP dasturining tayyor PHP tilini to’ldiradigan Distriputif lari mavjud. Bnday Distriputiflar ichida keng tarqalgani denver (http://dklap.ru/chicken/veb/) uni o’rnatishni o’rganish uchun veb mutaxasislar saytlariga murojat qilish kerak. Denverni ornatish juda oddiy hamda unga hech qanday bilim talab etilmasligini aytib o’tish kerak . Bu Distriputivni PHP tilini endigina o’rganayotgann yosh dasturchilar uchunn tavsiya qilamiz ."));

        list.add(new BookData(R.drawable.kitob9, "CSS haqida ", "CSS (Cascading style sheets – Kaskadlangan stillar jadvali) — bu belgilash tilidan foydalanib yozilgan hujjatlarning ko’rinishini tasvirlash uchun ishlatiladigan rasmiy til hisoblanadi.\n" +
                "\n" +
                "U asosan HTML va XHTML belgilash tillari yordamida yozilgan veb-sahifalarning ko’rinishini tasvirlash va loyihalash vositasi sifatida ishlatiladi, ammo har qanday XML hujjatlariga, masalan, SVG yoki XUL-ga ham qo’llanilishi mumkin.\n" +
                "\n" +
                "CSS veb-sahifaning tashqi ko’rinishiga ishlov beradi. CSS dan foydalanib, siz matnning rangini, shriftlarning uslubini, paragraflar orasidagi bo’shliqni, ustunlarning o’lchamlari va joylashishini, fon rasmlari yoki ranglarning qanday ishlatilishini, sxemaning tuzilishini, turli xil qurilmalar va ekran o’lchamlari uchun displeyning o’zgarishini boshqarishingiz mumkin. shuningdek, turli xil effektlarni ham.\n" +
                "\n" +
                "Bizning CSS bo’yicha darslarimizni bu yerdan topishingiz mumkin: CSS darslari\n" +
                "\n" +
                "CSS ning afzalliklari\n" +
                "CSS vaqtni tejaydi – Siz CSS ni bir marta yozib, keyin bir nechta HTML sahifalarida qayta foydalanishingiz mumkin. Har bir HTML elementi uchun uslubni aniqlab, uni istaganingizcha veb-sahifalarga qo’llashingiz mumkin.\n" +
                "\n" +
                "Sahifalar tezroq yuklanadi – Agar siz CSSdan foydalanayotgan bo’lsangiz, har safar HTML atributlarini yozishingiz shart emas. Bir tegning bitta CSS qoidasini yozing va uni ushbu tegning barcha holatlariga qo’llang. Shunday qilib, kam kod degani tezroq yuklab olish vaqtini anglatadi.\n" +
                "\n" +
                "Oson texnik xizmat ko’rsatish – global o’zgarishni amalga oshirish uchun oddiygina uslubni o’zgartiring va barcha veb-sahifalardagi barcha elementlar avtomatik ravishda yangilanadi.\n" +
                "\n" +
                "HTML ga nisbatan ustun uslublar CSS da HTML ga nisbatan ancha kengroq xususiyatlar mavjud, shuning uchun HTML atributlarga qaraganda HTML sahifangizga yanada yaxshiroq ko’rinish berishingiz mumkin.\n" +
                "\n" +
                "Bir nechta qurilmalar mosligi – Uslublar jadvallari bir nechta turdagi qurilmalar uchun tarkibni optimallashtirishga imkon beradi. Xuddi shu HTML hujjatidan foydalangan holda veb-saytning turli xil versiyalari uyali telefonlar kabi qo’lda yoki qurilmalarda taqdim etilishi mumkin.\n" +
                "\n" +
                "CSS ni kim yaratadi va saqlaydi?\n" +
                "CSS W3C tarkibidagi CSS ishchi guruhi deb nomlangan odamlar guruhi tomonidan yaratiladi va saqlanadi. CSS ishchi guruhi spetsifikatsiyalar deb nomlangan hujjatlarni yaratadi. Agar spetsifikatsiya muhokama qilinib, W3C a’zolari tomonidan rasman tasdiqlangan bo’lsa, u tavsiyanomaga aylanadi.\n" +
                "\n" +
                "CSS tarixi\n" +
                "CSS birinchi marta 1997 yilda veb-ishlab chiquvchilar uchun yaratilgan veb-sahifalarning Ko’rinishini aniqlash uchun ishlab chiqilgan. Veb-professionallar veb-sayt kodining mazmuni va tarkibini vizual dizayndan ajratishga imkon berish uchun mo’ljallangan edi.\n" +
                "\n" +
                "Strukturani va uslubni ajratish HTML-ga asosan, «paydo bo’lishi va his qilish» deb nomlanadigan narsaning dizayni va tartibini tashvishga solmasdan, aslida asosli bo’lgan funktsiyadan ko’proq narsani bajarishga imkon beradi.\n" +
                "\n" +
                "Veb-brauzerlar ushbu tilning asosiy shrift va rang tomonlaridan ko’proq foydalana boshlagach, CSS 2000 atrofida mashhurlikka erisha olmadi. Bugungi kunda barcha zamonaviy brauzerlar CSS-ning 1-bosqichi, CSS-ning 2-darajali qismi va hatto CSS-ning 3-darajali aspektlarini qo’llab-quvvatlaydi. CSS-ning rivojlanishi va yangi uslublar joriy etilishi davom etar ekan, veb-brauzerlar ushbu brauzerlarda yangi CSS-ni qo’llab-quvvatlaydigan va veb-dizaynerlar bilan ishlash uchun kuchli yangi uslublar vositalarini beradigan modullarni joriy qila boshladilar.\n" +
                "\n" +
                "Ko’p yillar davomida veb-saytlarni loyihalash va ishlab chiqish uchun CSS-dan foydalanishni rad etgan tanlovli veb-dizaynerlar mavjud edi, ammo bu amaliyot bugungi kunda sanoatdan chiqib ketdi. CSS hozir veb-dizayni uchun keng tarqalgan ishlatiladigan standart bo’lib, siz bugungi kunda ushbu tilda hech qanday asosiy tushunchaga ega bo’lmagan sohada ishlaydigan har bir kishini topishingiz qiyinlashadi."));

        list.add(new BookData(R.drawable.swift, "Swift dasturlash tili", "Swiftni ishlab chiqish 2010-yilning iyul oyida Kris Lattner tomonidan, Appledagi ko‘plab boshqa dasturchilar bilan hamkorlikda boshlangan. Swift “Objective-C, Rust, Haskell, Ruby, Python, C#, CLU” va boshqa dasturlash tillari ustida ishlab chiqarilgan dasturlash tili hisoblanadi.\n" +
                "\n" +
                "Swift — bu Apple Inc. va ochiq manbali hamjamiyat tomonidan ishlab chiqilgan umumiy maqsadli, kompilyatsiya qilingan dasturlash tili. Birinchi marta 2014-yilda chiqarilgan Swift Apple kompaniyasining oldingi Objective-C dasturlash tili oʻrniga ishlab chiqilgan, chunki Objective-C 1980-yillarning boshidan beri deyarli oʻzgarmagan va zamonaviy til xususiyatlariga ega emas edi. Swift Apple kompaniyasining Cocoa va Cocoa Touch frameworklari bilan ishlaydi va Swift dizaynining asosiy jihati oldingi o’n yilliklarda Apple mahsulotlari uchun ishlab chiqilgan mavjud Objective-C kodining katta qismi bilan o’zaro ishlash qobiliyati edi.\n" +
                "\n" +
                "O’rganish oson bo’lgan kuchli dasturlash tili hisoblanadi.\n" +
                "\n" +
                "Swift iOS, iPadOS, macOS, tvOS va watchOS uchun ishlatiladigan dasturlash tili hisoblanadi. Swift kodini yozish sintaksis jihatidan ixcham va tushunarli, dasturchilarga yoqadigan zamonaviy xususiyatlarni o’z ichiga oladi. Swift kodi dizayni bo’yicha xavfsiz, lekin ayni paytda chaqmoq tezligida ishlaydigan dasturiy ta’minot ishlab chiqaradi.\n" +
                "\n" +
                "Keling, swift dasturlash tilida bitta misol ko’rsak:\n" +
                "\n" +
                "Dastur biz son kiritgan vaqtimizda, o’sha songacha bo’lgan tub sonlarni chiqarsin.\n" +
                "\n" +
                "Yechim: Demak avvalo, sonning tub yoki tub emasligini tekshiruvchi isPrime() funksiyasini tuzib olamiz.\n" +
                "\n" +
                "func isPrime(number: Int) -> Bool {\n" +
                "var count = 0\n" +
                "for index in 1…Int(Double(number).squareRoot()) {\n" +
                "if number%index == 0 {\n" +
                "count = count + 1 }\n" +
                "}\n" +
                "return count == 1\n" +
                "}\n" +
                "\n" +
                "Endi esa bu funksiyani kerakli joyda ishlatamiz.\n" +
                "\n" +
                "print(“Son kiriting:”)\n" +
                "let inputNumber = Int(readLine()!)\n" +
                "if let son = inputNumber {\n" +
                "for index in 2…son{\n" +
                "if isPrime(number: index) {\n" +
                "print(index) }\n" +
                "}\n" +
                "}\n" +
                "else{\n" +
                "print(“Son kiriting!”)\n" +
                "}"));
        list.add(new BookData(R.drawable.tayp, "TypeScript dasturlash tili", "TypeScript JavaScript-ning “lazzati” yoki “varianti” ekanligini allaqachon eshitgan bo'lsangiz kerak. TypeScript (TS) va JavaScript (JS) o'rtasidagi munosabatlar zamonaviy dasturlash tillari orasida juda noyobdir, shuning uchun bu munosabatlar haqida ko'proq bilish TypeScript JavaScript-ga qanday qo'shilishini tushunishga yordam beradi.\n" +
                "\n" +
                "JavaScript nima? Qisqacha tarix\n" +
                "JavaScript (ECMAScript nomi bilan ham tanilgan) o'z hayotini brauzerlar uchun oddiy skript tili sifatida boshlagan. U ixtiro qilingan paytda, u veb-sahifaga kiritilgan qisqa kod parchalari uchun ishlatilishi kutilgan edi - bir necha o'ndan ortiq kod satrlarini yozish biroz g'ayrioddiy bo'lar edi. Shu sababli, dastlabki veb-brauzerlar bunday kodni juda sekin bajardilar. Vaqt o'tishi bilan JS tobora ommalashib bordi va veb-ishlab chiquvchilar undan interaktiv tajriba yaratish uchun foydalanishni boshladilar.\n" +
                "\n" +
                "Veb-brauzer ishlab chiquvchilari JS-dan foydalanishning ko'payishiga o'zlarining ijro mexanizmlarini optimallashtirish (dinamik kompilyatsiya) va u bilan nima qilish mumkinligini kengaytirish (API qo'shish) orqali javob berishdi, bu esa o'z navbatida veb-ishlab chiquvchilarni undan ko'proq foydalanishga majbur qildi. Zamonaviy veb-saytlarda brauzeringiz tez-tez yuz minglab kod satrlarini o'z ichiga olgan ilovalarni ishga tushiradi. Bu oddiy statik sahifalar tarmog'i sifatida boshlangan va barcha turdagi boy ilovalar uchun platformaga aylanib borayotgan \"veb\" ning uzoq va asta-sekin o'sishidir .\n" +
                "\n" +
                "Bundan tashqari, JS brauzerlar kontekstidan tashqarida foydalanish uchun etarlicha mashhur bo'ldi, masalan, node.js yordamida JS serverlarini amalga oshirish. JS-ning \"har qanday joyda chopish\" xususiyati uni platformalararo rivojlanish uchun jozibali tanlovga aylantiradi. Bugungi kunda ko'plab ishlab chiquvchilar bor, ular butun stekni dasturlash uchun faqat JavaScript-dan foydalanadilar!\n" +
                "\n" +
                "Xulosa qilib aytadigan bo'lsak, bizda tez foydalanish uchun mo'ljallangan til mavjud va keyin millionlab qatorli ilovalarni yozish uchun to'liq vositaga aylandi. Har bir tilning o'ziga xos g'alati tomonlari bor - g'alatiliklar va kutilmagan hodisalar va JavaScript-ning kamtarona boshlanishi uni bularning ko'piga ega qiladi. Ba'zi misollar:\n" +
                "\n" +
                "JavaScript-ning tenglik operatori ( ==) o'z operandlarini majburlab , kutilmagan xatti-harakatlarga olib keladi:\n" +
                "\n" +
                "if (\"\" == 0) {\n" +
                "  // It is! But why??\n" +
                "}\n" +
                "if (1 < x < 3) {\n" +
                "  // True for *any* value of x!\n" +
                "}\n" +
                "JavaScript shuningdek mavjud bo'lmagan xususiyatlarga kirishga imkon beradi:\n" +
                "\n" +
                "const obj = { width: 10, height: 15 };\n" +
                "// Why is this NaN? Spelling is hard!\n" +
                "const area = obj.width * obj.heigth;\n" +
                "Ko'pgina dasturlash tillari bunday xatolar yuzaga kelganda xatoga yo'l qo'yadi, ba'zilari esa kompilyatsiya paytida - har qanday kod ishga tushmasdan oldin buni qiladi. Kichik dasturlarni yozishda bunday g'ayrioddiyliklar zerikarli, ammo boshqarish mumkin; yuzlab yoki minglab kod satrlari bilan ilovalarni yozishda bu doimiy kutilmagan hodisalar jiddiy muammodir.\n" +
                "\n" +
                "TypeScript: Statik turdagi tekshiruvchi\n" +
                "Yuqorida biz ba'zi tillar bu noto'g'ri dasturlarning ishlashiga umuman ruxsat bermasligini aytdik. Koddagi xatolarni uni ishga tushirmasdan aniqlash statik tekshirish deb ataladi . Amaldagi qiymatlar turiga qarab nima xato va nimasi asoslanmaganligini aniqlash statik turdagi tekshirish deb nomlanadi.\n" +
                "\n" +
                "TypeScript dasturni bajarishdan oldin xatolarni tekshiradi va buni qiymatlar turlariga asoslanib , uni statik turdagi tekshiruvchiga aylantiradi . Masalan, yuqoridagi oxirgi misolda xatolik borobj . TypeScript xatosi topildi:\n" +
                "\n" +
                "const obj = { width: 10, height: 15 };\n" +
                "const area = obj.width * obj.heigth;\n" +
                "Property 'heigth' does not exist on type '{ width: number; height: number; }'. Did you mean 'height'?\n" +
                "Sinab ko'ring\n" +
                "JavaScript-ning yozilgan super to'plami\n" +
                "TypeScript JavaScript bilan qanday bog'liq?\n" +
                "\n" +
                "Sintaksis\n" +
                "TypeScript JavaScript-ning yuqori to'plami bo'lgan tildir : JS sintaksisi shuning uchun qonuniy TS hisoblanadi. Sintaksis dasturni yaratish uchun matn yozish usulini anglatadi. Misol uchun, bu kodda sintaksis xatosi bor, chunki unda ):\n" +
                "\n" +
                "let a = (4\n" +
                "')' expected.\n" +
                "Sinab ko'ring\n" +
                "TypeScript hech qanday JavaScript kodini sintaksisi tufayli xato deb hisoblamaydi. Bu shuni anglatadiki, siz har qanday ishlaydigan JavaScript kodini olib, uni qanday yozilganligi haqida o'ylamasdan TypeScript fayliga qo'yishingiz mumkin.\n" +
                "\n" +
                "Turlari\n" +
                "Biroq, TypeScript yoziladigan super to'plamdir, ya'ni u turli xil qiymatlardan qanday foydalanish mumkinligi haqida qoidalarni qo'shadi. Oldingi xato sintaksisobj.heigth xatosi emas edi : bu qandaydir qiymatni ( turi ) noto'g'ri ishlatish xatosi.\n" +
                "\n" +
                "Yana bir misol sifatida, bu JavaScript kodi boʻlib, uni brauzeringizda ishga tushirishingiz mumkin va u qiymatni qayd qiladi :\n" +
                "\n" +
                "console.log(4 / []);\n" +
                "Bu sintaktik-huquqiy dastur jurnallar Infinity. TypeScript esa, raqamni massivga bo'lishni bema'ni operatsiya deb hisoblaydi va xatoga yo'l qo'yadi:\n" +
                "\n" +
                "console.log(4 / []);\n" +
                "The right-hand side of an arithmetic operation must be of type 'any', 'number', 'bigint' or an enum type.\n" +
                "Sinab ko'ring\n" +
                "Ehtimol, siz haqiqatan ham nima sodir bo'lishini ko'rish uchun raqamni massivga bo'lishni maqsad qilgandirsiz , lekin ko'pincha bu dasturlash xatosi. TypeScript turi tekshirgichi iloji boricha ko'proq keng tarqalgan xatolarni ushlash bilan birga to'g'ri dasturlarga ruxsat berish uchun mo'ljallangan. (Keyinroq, TypeScript sizning kodingizni qanchalik qat'iy tekshirishini sozlash uchun foydalanishingiz mumkin bo'lgan sozlamalar haqida bilib olamiz.)\n" +
                "\n" +
                "Agar siz ba'zi kodlarni JavaScript faylidan TypeScript fayliga ko'chirsangiz, kod qanday yozilishiga qarab yozish xatolarini ko'rishingiz mumkin. Bu kod bilan bog'liq qonuniy muammolar yoki TypeScript haddan tashqari konservativ bo'lishi mumkin. Ushbu qo'llanma davomida biz bunday xatolarni bartaraf etish uchun turli xil TypeScript sintaksisini qanday qo'shishni ko'rsatamiz.\n" +
                "\n" +
                "Ish vaqti harakati\n" +
                "TypeScript, shuningdek, JavaScript-ning ishlash vaqtini saqlaydigan dasturlash tilidir . Misol uchun, JavaScript-da nolga bo'linish Infinityish vaqti istisnosini tashlash o'rniga hosil qiladi. Printsipial sifatida, TypeScript hech qachon JavaScript kodining ishlash vaqtini o'zgartirmaydi.\n" +
                "\n" +
                "Bu shuni anglatadiki, agar siz kodni JavaScript-dan TypeScript-ga o'tkazsangiz, TypeScript kodda xatolik bor deb hisoblasa ham, xuddi shu tarzda ishlashi kafolatlanadi .\n" +
                "\n" +
                "JavaScript bilan bir xil ish vaqtini saqlash TypeScript-ning asosiy va'dasidir, chunki bu sizning dasturingiz ishlamay qolishi mumkin bo'lgan nozik farqlar haqida tashvishlanmasdan ikki til o'rtasida osongina o'tishni anglatadi.\n" +
                "\n" +
                "O'chirilgan turlari\n" +
                "Taxminan aytganda, TypeScript kompilyatori kodingizni tekshirib bo'lgach, natijada \"kompilyatsiya qilingan\" kodni yaratish uchun turlarni o'chirib tashlaydi . Bu shuni anglatadiki, sizning kodingiz kompilyatsiya qilingandan so'ng, natijada olingan oddiy JS kodida turdagi ma'lumotlar yo'q.\n" +
                "\n" +
                "Bu shuni anglatadiki, TypeScript hech qachon dasturingizning xatti-harakatlarini u taxmin qilgan turlarga qarab o'zgartirmaydi. Xulosa shuki, kompilyatsiya paytida siz tipdagi xatolarni ko'rishingiz mumkin bo'lsa-da, tip tizimining o'zi dasturingiz ishlayotganda qanday ishlashiga ta'sir qilmaydi.\n" +
                "\n" +
                "Nihoyat, TypeScript qo'shimcha ish vaqti kutubxonalarini ta'minlamaydi. Sizning dasturlaringiz JavaScript dasturlari kabi bir xil standart kutubxonadan (yoki tashqi kutubxonalardan) foydalanadi, shuning uchun o'rganish uchun qo'shimcha TypeScript-ga xos ramka yo'q.\n" +
                "\n" +
                "JavaScript va TypeScript-ni o'rganish\n" +
                "Biz tez-tez \"JavaScript yoki TypeScript-ni o'rganishim kerakmi?\" Degan savolni ko'ramiz.\n" +
                "\n" +
                "Javob: JavaScript-ni o'rganmasdan turib TypeScript-ni o'rganib bo'lmaydi! TypeScript JavaScript bilan sintaksis va ish vaqti xatti-harakatlarini baham ko'radi, shuning uchun JavaScript haqida o'rgangan har qanday narsa bir vaqtning o'zida TypeScript-ni o'rganishga yordam beradi.\n" +
                "\n" +
                "JavaScript-ni o'rganish uchun dasturchilar uchun juda ko'p resurslar mavjud; Agar siz TypeScript yozayotgan bo'lsangiz, ushbu manbalarni e'tiborsiz qoldirmasligingiz kerak . Masalan, StackOverflow savollariga javascriptnisbatan 20 baravar ko'proq teglangan typescript, ammo barcha savollar javascriptTypeScript-ga ham tegishli.\n" +
                "\n" +
                "Agar siz \"TypeScript-da ro'yxatni qanday saralash\" kabi narsalarni qidirayotgan bo'lsangiz, esda tuting: TypeScript JavaScript-ning kompilyatsiya vaqti turini tekshirgich bilan ishlash vaqtidir . TypeScript-da ro'yxatni saralash usuli JavaScript-da xuddi shunday. Agar siz to'g'ridan-to'g'ri TypeScript-dan foydalanadigan resurs topsangiz, bu ham ajoyib, lekin ishlash vaqtidagi vazifalarni qanday bajarish bo'yicha kundalik savollarga TypeScript-ga xos javoblar kerak deb o'ylash bilan cheklanmang."));


        list.add(new BookData(R.drawable.rust, "Rust dasturlash tili", "Rust -bu tizim dasturlash tili bo'lib, u Mozilla tomonidan yangi eksprement sifatida ishlab chiqarilgan. Bu tilni yaratishda uning mualliflari oldilariga 3 masalani hal qilishni maqsad qilib olishgan:\n" +
                "\n" +
                "Xavfsiz dasturlash tili yaratish;\n" +
                "Tez ishlaydigan dasturlash tili yaratish;\n" +
                "Parallel ishlash uchun mo'ljallangan dasturlash tili yaratish.\n" +
                "Rust dasturlash tili kompilyatsiya bo'ladigan dasturlash tili bo'lib, u qaysidir ma'noda C/C++ ning o'rnini bosishi uchun yaratilgan. Albatta, bu masalada bir muhim ma'lumotni qayt etish kerak, ya'ni, shu kungacha ko'plab kompaniya va dasturchilar tomonidan C/C++ ning ko'plap muqobil raqobatchilari yaratilgan. Masalan, D dasturlash tili yoki Googe tomonidan ishlab chiqilgan Go dasturlash tili...\n" +
                "\n" +
                "Yuqorida keltirilgan 3 masalaga yechim topishda Rust dasturlash tili hech qanday axlat tozalovchilarsiz bajarish uddalangan. Kompilyatsiya vaqtida Rust xavfsizlik yuzasidan ko'plab tekshiruvlarni amalga oshiradi. Buning natijasida, Rustda yaratilgan dasturlash ishlash vaqtida ba'zi kutilgan va kutilmagan resurslar sarflanishini oldi olinadi. Shu sababli, Rust dasturlash tili boshqa raqobatchi dasturlash tillariga nisbatan ustunlik qiladi.\n" +
                "\n" +
                "Rust dasturlash tili o'z navbatida funksional, parallel, protsedurali va obyektga yo'naltirilgan dasturlashni qo'llab-quvvatlaydi, ya'ni hozirda ko'plab loyihalarda qo'llanilayotgan dasturlash paradigmlarining deyarli barchasini.\n" +
                "\n" +
                "Rust uchun quyidagi fikrlar o'rinli:\n" +
                "\n" +
                "Rust dasturlash tili krossplatformali bo'lib, u Windows, Linux va MacOS operatsion tizimlarida ishlaydi;\n" +
                "Rust kompilyatori Rust dasturlash tilida yozilgan va u LLVMdan foydalanadi;\n" +
                "Rust dasturlash tili turlarni avtomatik chiqarish bilan aniq statik turlashni ishlatadi;\n" +
                "Rust dasturlash tilida metadasturlash mavjud(turlangan);\n" +
                "Rust kompilyatori\n" +
                "Quyida Rust dasturlash tilidan yozilgan bir nechta dasturlar kodi keltirilgan:\n" +
                "\n" +
                "Bu odatiy \"Hello World\" dasturi:\n" +
                "\n" +
                "use std;\n" +
                "fn main(args: [str]) {\n" +
                "    std::io::println(\"hello world from \" + args[0] + \"!\");\n" +
                "}\n" +
                "Bu faktorialni hisoblovchi funksiya kodi\n" +
                "\n" +
                "fn fac(n: int) -> int {\n" +
                "    let result = 1, i = 1;\n" +
                "    while i <= n {\n" +
                "        result *= i;\n" +
                "        i += 1;\n" +
                "    }\n" +
                "    ret result;\n" +
                "}\n" +
                "Rust dasturlash tili Go dasturlash tiliga o'xshab strukturali tiplarni qo'llab-quvvatlaydi. Rust dasturlash tilida strukturalar \"yozuvlar\" deb nomlanadi."));
        list.add(new BookData(R.drawable.r_icon, "R dasturlash tili", "R dasturlash tili  prognozli tahlil va ma'lumotlarni vizualizatsiya qilish  uchun  ochiq kodli skript tilidir  .\n" +
                "\n" +
                "R ning dastlabki versiyasi 1995 yilda akademik statistiklarga va murakkab dasturlash ko'nikmalariga ega bo'lgan boshqa shaxslarga murakkab ma'lumotlarni statistik tahlil qilish  va natijalarni har qanday ko'plab vizual grafiklarda ko'rsatish imkonini berish uchun chiqarilgan  . \"R\" nomi o'sha paytda Oklend universiteti bilan bog'liq bo'lgan ikki dasturchi Ross Ihaka va Robert Gentleman ismlarining birinchi harfidan olingan.\n" +
                "\n" +
                "R dasturlash tili chiziqli modellashtirish, chiziqli bo'lmagan modellashtirish, klassik statistika, tasniflash, klasterlash va boshqalarni qo'llab-quvvatlaydigan funksiyalarni o'z ichiga oladi. O'zining mustahkam xususiyatlari va Erkin dasturiy ta'minot jamg'armasining GNU umumiy litsenziyasi shartlariga ko'ra uni manba kodi shaklida bepul yuklab olish mumkinligi tufayli u akademik muhitda mashhur bo'lib qoldi . U UNIX platformalarida va Linux, Windows va MacOS kabi boshqa tizimlarda kompilyatsiya qiladi va ishlaydi.\n" +
                "\n" +
                "R tilining jozibadorligi asta-sekin akademiyadan biznes muhitiga tarqaldi, chunki kollejda R bo'yicha o'qigan ko'plab ma'lumotlar tahlilchilari tajribasiz bo'lgan yangi vositani olishdan ko'ra undan foydalanishni davom ettirishni afzal ko'rishadi.\n" +
                "\n" +
                "R dasturiy ta'minot muhiti\n" +
                "R tilidagi dasturlash muhiti standart buyruq qatori interfeysi atrofida qurilgan. Foydalanuvchilar ma'lumotlarni o'qish va uni ish maydoniga yuklash, buyruqlarni belgilash va natijalarni olish uchun undan foydalanadilar. Buyruqlar oddiy matematik operatorlardan, jumladan +, -, * va /, chiziqli regressiyalar va boshqa rivojlangan hisoblarni bajaradigan murakkabroq funktsiyalargacha bo'lgan har qanday narsa bo'lishi mumkin.\n" +
                "\n" +
                "Foydalanuvchilar o'z funktsiyalarini ham yozishlari mumkin. Atrof-muhit foydalanuvchilarga alohida ma'lumotlar fayllarini bitta hujjatga birlashtirish, bitta o'zgaruvchini chiqarish va natijada olingan ma'lumotlar to'plamida regressiyani amalga oshirish kabi individual operatsiyalarni qayta-qayta ishlatish mumkin bo'lgan yagona funktsiyaga birlashtirish imkonini beradi.\n" +
                "\n" +
                "Loop funktsiyalari R dasturlash muhitida ham mashhur. Bu funksiyalar foydalanuvchilarga kattaroq maʼlumotlar toʻplamidan namunalarni olish kabi baʼzi amallarni takror-takror bajarish imkonini beradi.\n" +
                "\n" +
                "R tilining ijobiy va salbiy tomonlari\n" +
                "R dasturlash tilining ko'plab foydalanuvchilari uni bepul yuklab olish, murakkab ma'lumotlarni tahlil qilish imkoniyatlarini taqdim etishi va qo'llab-quvvatlash uchun murojaat qilishlari mumkin bo'lgan onlayn faol foydalanuvchilar hamjamiyatiga ega ekanligi yoqadi.\n" +
                "\n" +
                "Ko'p yillar davomida mavjud bo'lganligi va butun mavjudligi davomida mashhur bo'lganligi sababli, til etarlicha etuk. Foydalanuvchilar tilning asosiy funksiyalarini yaxshilaydigan qo'shimcha paketlarni yuklab olishlari mumkin. Ushbu paketlar foydalanuvchilarga ma'lumotlarni vizualizatsiya qilish , tashqi ma'lumotlar bazalariga ulanish, ma'lumotlarni geografik xaritalash va ilg'or statistik funktsiyalarni bajarish imkonini beradi. R tilida kodlashni soddalashtiradigan RStudio deb nomlangan mashhur foydalanuvchi interfeysi ham mavjud .\n" +
                "\n" +
                "R tili katta ma'lumotlar to'plamlariga qo'llanilganda sekin tahlillarni etkazib berish uchun tanqid qilindi. Buning sababi shundaki, til bitta oqimli ishlov berishdan foydalanadi, ya'ni asosiy ochiq manba versiyasi bir vaqtning o'zida faqat bitta protsessordan foydalanishi mumkin. Taqqoslash uchun, zamonaviy katta ma'lumotlar tahlili parallel ravishda ma'lumotlarni qayta ishlashda rivojlanadi va bir vaqtning o'zida katta hajmdagi ma'lumotlarni qayta ishlash uchun serverlar klasterida o'nlab protsessorlardan foydalanadi.\n" +
                "\n" +
                "Yagona tarmoqli ishlov berish cheklovlariga qo'shimcha ravishda, R dasturlash muhiti xotiradagi dastur hisoblanadi. Barcha ma'lumotlar ob'ektlari ma'lum bir seans davomida mashinaning operativ xotirasida saqlanadi. Bu R bir vaqtning o'zida ishlashi mumkin bo'lgan ma'lumotlar miqdorini cheklashi mumkin.\n" +
                "\n" +
                "R va katta ma'lumotlar\n" +
                "Ushbu cheklovlar R tilining katta ma'lumotlar ilovalarida qo'llanilishini yumshatdi . R ni ishlab chiqarishga qo'yish o'rniga, ko'pgina korporativ foydalanuvchilar R dan tadqiqot va tergov vositasi sifatida foydalanadilar. Ma'lumotlar bo'yicha olimlar R dan namunaviy ma'lumotlar bo'yicha murakkab tahlillarni o'tkazish uchun foydalanadilar va keyin ma'lumotlarda mazmunli korrelyatsiya yoki klasterni aniqlagandan so'ng, korxona miqyosidagi vositalar orqali topilmani mahsulotga kiritadilar.\n" +
                "\n" +
                "Bir nechta dasturiy ta'minot sotuvchilari o'zlarining takliflariga R dasturlash tilini qo'llab-quvvatladilar, bu R ga zamonaviy katta ma'lumotlar sohasida kuchliroq asosga ega bo'lish imkonini beradi. IBM, Microsoft, Oracle, SAS instituti, TIBCO va Tableau kabi sotuvchilar o'zlarining analitik dasturlari va R tili o'rtasida ma'lum darajadagi integratsiyani o'z ichiga oladi. Bundan tashqari, mashhur ochiq manbali katta ma'lumotlar platformalari uchun R paketlari mavjud, jumladan Hadoop va Spark ."));

        list.add(new BookData(R.drawable.dart, "Dart dasturlash tili", "1995 yilda taqdim etilganidan beri JavaScript eng taniqli va keng qo'llaniladigan dasturlash tillaridan biriga aylandi. Lekin bu kamchiliklardan xoli emas edi; JavaScript katta kod bazalarini talab qiladi va unchalik kengaytirilishi mumkin emas. Buni bartaraf etish uchun 2011 yilda Google tomonidan Dart deb nomlangan boshqa dasturlash tili taqdim etildi. Google tuzilgan va moslashuvchan veb-dasturlashni qo'llab-quvvatlash uchun Dart dasturlash tilini taqdim etdi. Keling, ushbu dasturlash tilini, uning xususiyatlari va JavaScript-dan qanchalik farq qilishini batafsil ko'rib chiqaylik.\n" +
                "\n" +
                "Dart dasturlash tiliga kirish\n" +
                "Dart - bu turli platformalarda mobil va veb-ilovalarni yaratish uchun foydalaniladigan ob'ektga yo'naltirilgan mijoz uchun optimallashtirilgan dasturlash tili. U foydalanuvchi va server tomonida ishlash uchun ishlatilishi mumkin bo'lgan foydalanish uchun qulay ilovalarga ega. Dart C uslubidagi sintaksisdan foydalanadi va asosan mobil ilovalar uchun foydalanuvchi interfeyslarini yaratish uchun ishlatiladi.\n" +
                "\n" +
                "Dart dasturlash tili nima uchun ishlatiladi?\n" +
                "Dart yuqori samarali mobil yoki veb-ilovalarni yaratish uchun ishlatiladi. Uning eng muhim ilovalariga quyidagilar kiradi:\n" +
                "\n" +
                "Bu Flutter ramkasi uchun asosiy dasturlash tili bo'lib, quyida batafsilroq tushuntiriladi va kengaytiriladigan mobil ilovalarni yaratish uchun ishlatiladi.\n" +
                "Umumiy maqsadli dasturlash tili bo'lib, u Android yoki iOS uchun mahalliy mobil ilovalar, ish stoli ilovalari va serverlar yaratish uchun ishlatiladi.\n" +
                "Nima uchun Dart dasturlash tilini o'rganishingiz kerak?\n" +
                "Nisbatan yangi dasturlash tili bo'lishiga qaramay, Dart o'zining noyob xususiyatlari va foydalanuvchilarga qulay atributlari tufayli juda mashhur bo'ldi. Buni nima uchun o'rganishingiz kerak:\n" +
                "\n" +
                "Samaradorlik\n" +
                "Bu tez sur'atda. U kodlarni tezroq tartibga solish uchun manbadan manbaga kompilyatordan foydalanadi. Demak, u boshqa dasturlash tillariga qaraganda samaraliroq interfeysga ega.\n" +
                "\n" +
                "Foydalanish qulayligi\n" +
                "Dart dasturlash vositasi bo'lgan Dartpad hech qanday dasturiy ta'minotni o'rnatmasdan to'g'ridan-to'g'ri brauzerdan til ustida ishlashni osonlashtiradi.\n" +
                "\n" +
                "Flutter Framework\n" +
                "Dartning Flutter ramkasi o'zaro platformali ilovalarni (bir nechta mobil operatsion tizimlar bilan mos keladigan ilovalar) yaratish uchun ishlatiladi. U eng yaxshi to'rtta mobil ilovalarni ishlab chiqish ramkalari qatoriga kiradi va 11 milliarddan ortiq yuklab olingan. Dart's Flutter ramkasi Alibaba va eBay kabi mashhur elektron tijorat brendlari uchun ilovalar yaratish uchun ishlatilgan. Flutterdan foydalanadigan boshqa kompaniyalarga BMW, Google Pay, ByteDance, Hamilton va Toyota kiradi. Flutter Dartdan foydalanishini hisobga olsak, agar siz Flutterni rivojlantirishni o'rganmoqchi bo'lsangiz, uni o'rganish juda muhimdir.\n" +
                "\n" +
                "Moslashuvchanlik\n" +
                "Dartni o'rganishingizning yana bir muhim sababi uning moslashuvchanligi va JavaScript bilan mosligidir. Bundan tashqari, dasturchilar kompilyatsiyada kichik xatolar bo'lsa ham, Dart-da dasturni ishga tushirishlari mumkin.\n" +
                "\n" +
                "Dart dasturlash tilining xususiyatlari\n" +
                "Dart ochiq kodli dasturlash tili bo'lib, uni dasturiy ta'minot ishlab chiqaruvchilari orasida hayratga solgan bepul ilg'or xususiyatlarga ega:\n" +
                "\n" +
                "Ob'ektga yo'naltirilgan\n" +
                "Ob'ektga yo'naltirilgan dasturlash tili Dart ma'lumotlardan funksiya yoki mantiq sifatida emas, balki ob'ekt sifatida foydalanadi. U sinf, interfeys, abstrakt va aralash kabi asosiy va ilg'or ob'ektga yo'naltirilgan dasturlash tushunchalarini qo'llab-quvvatlaydi.\n" +
                "\n" +
                "Asinxron\n" +
                "Bu asinxron dasturlash tili bo'lib, u yaxshilangan parallellikni ta'minlaydi. Oddiy qilib aytganda, Dart izolyatsiya deb ataladigan mustaqil ob'ektlardan foydalangan holda vazifalarni bir vaqtning o'zida bajarishga imkon beradi.\n" +
                "\n" +
                "Ko'p platformali qo'llab-quvvatlash\n" +
                "Dart Virtual Machine (Dart VM) xususiyati tufayli u Windows, Linux, macOS va boshqa asosiy operatsion tizimlar kabi turli xil operatsion tizimlarda ishlashi mumkin. \n" +
                "\n" +
                "O'rnatilgan kutubxonalar\n" +
                "Dart keng qamrovli o'rnatilgan kutubxonalarni o'z ichiga oladi, masalan, Input-Output (IO), Software Development Kit (SDK), Math, Convert, Core, Asinxron, HTML va boshqalar. Siz ushbu kutubxonalarda oldindan yozilgan kodlarni topishingiz va vazifalaringizni optimallashtirish uchun ularni import qilishingiz mumkin.\n" +
                "\n" +
                "Dart dasturlash tilining afzalliklari\n" +
                "JavaScript-ni biladigan har bir kishi Dartni osongina o'rganishi mumkin\n" +
                "Bu tez kompilyatsiya qilishni osonlashtiradigan kengaytiriladigan va moslashuvchan til \n" +
                "Dart - bu real vaqt rejimida yuqori samarali dasturlarni yaratish uchun ishlatiladigan barqaror dasturlash tili\n" +
                "U “Vaqtdan oldin” (AOT) va “O'z vaqtida” (JIT) kompilyatsiyasini qo'llab-quvvatlaydi va tez o'zgaruvchan ish oqimlariga moslasha oladi.\n" +
                "Dart dasturlash tilining kamchiliklari\n" +
                "Dart yangi dasturlash tili bo'lgani uchun u kichik qo'llab-quvvatlash hamjamiyatiga ega va juda ko'p o'rganish resurslariga ega emas\n" +
                "U bitta ob'ekt sinfini o'z ichiga oladi va kodlarning takrorlanishini qo'llab-quvvatlamaydi\n" +
                "Dart yangi tayinlash bayonotini yozmasdan funksiya nomini o'zgartirishni qo'llab-quvvatlamaydi \n" +
                "Dart dasturlash tiliga misol\n" +
                "Har qanday dasturlash tilidagi eng keng tarqalgan misol \"Salom, dunyo!\" Quyida uni Dart-da chop etish uchun kod berilgan.\n" +
                "\n" +
                "void main() {\n" +
                "print('Salom, dunyo!');\n" +
                "}\n" +
                "\n" +
                "Dart dasturlash tili kodining yana bir misoli , kodning deyarli barcha asosiy xususiyatlarini o'z ichiga oladi:\n" +
                "\n" +
                "// Funktsiyani aniqlang.\n" +
                "void printInteger(int aNumber) {\n" +
                "print('Raqam $aNumber.'); // Konsolga chop etish.\n" +
                "}\n" +
                "\n" +
                "// Bu yerda dastur ishga tusha boshlaydi.\n" +
                "void main() {\n" +
                "var raqami = 42; // O'zgaruvchini e'lon qilish va ishga tushirish.\n" +
                "printInteger(raqam); // Funktsiyani chaqirish.\n" +
                "}\n" +
                "\n" +
                "Dart va JavaScript\n" +
                "Dart Java va JavaScript-ga o'xshash til sintaksisiga ega. Shuning uchun JavaScript-ni biladigan dasturchilar uchun Dartni o'rganish osonroq. Biroq, ular bir nechta asosiy farqlarga ega:\n" +
                "\n" +
                "Foydalanish imkoniyati va foydalanuvchilar uchun qulaylik\n" +
                "JavaScript 1995 yilda yaratilgan va etuk tildir. Mavjud kodlarni qayta ishlatish uchun bir nechta JavaScript ramkalari yoki kutubxonalarini topishingiz mumkin. Dart 2011 yilda ishlab chiqilgan va nisbatan yangiroq. U juda ko'p kutubxonalar yoki ramkalarni o'z ichiga olmaydi va bu ishlab chiquvchilarga tilning to'liq imkoniyatlaridan foydalanishni qiyinlashtiradi.\n" +
                "\n" +
                "Xavfsizlik turi\n" +
                "Dart kompilyatsiya qilingan til sifatida ishlab chiquvchilarga kompilyatsiya jarayonida dasturiy xatolarni aniqlash imkonini beradi. Shunday qilib, u turdagi xavfsiz til hisoblanadi. Boshqa tomondan, Java talqin qilinadigan tildir va ishlab chiquvchilarga ish vaqtida dasturlash xatolarini topishga imkon beradi. Shuning uchun, Dart JavaScript-ga nisbatan xavfsizroq tildir.\n" +
                "\n" +
                "Til muharriri\n" +
                "Dart Sublime yoki VIM engil muharrirlaridan foydalanadi, JavaScript esa Emacs yoki Atom kabi muharrirlardan foydalanadi.\n" +
                "\n" +
                "Ilovalar\n" +
                "U odatda Flutter tizimi uchun asosiy til sifatida o'zaro faoliyat platformali mobil ilovalarni ishlab chiqish uchun ishlatiladi. U ilovalarni orqa tomondan ishlab chiqish uchun ishlatilmaydi. Boshqa tomondan, JavaScript-dan mobil va veb-ilovalarni backend va server tomonida ishlab chiqish uchun foydalanish mumkin. \n" +
                "\n" +
                "HAM O'QING: Siz foydalanishingiz mumkin bo'lgan 10 ta oson va aqlli JavaScript loyiha g'oyalari\n" +
                "\n" +
                "Dart dasturlash tilini qanday o'rganish mumkin?\n" +
                "Agar siz yangi boshlovchi bo'lsangiz, bu bosqichma-bosqich jarayon sizga Dartni qanday o'rganishni tushunishga yordam beradi:\n" +
                "\n" +
                "1-qadam: Til sintaksisini va sinflar, o'zgaruvchilar va ma'lumotlar turlari kabi boshqa asosiy tushunchalarni o'rganishdan boshlang.\n" +
                "\n" +
                "2-qadam: Dart VM va boshqa ishlab chiqish vositalarini o'z ichiga olgan Dart SDK haqida bilib, Dart dasturiy ta'minotini yaratish vositalari bilan tanishing.\n" +
                "\n" +
                "3-qadam: Dart kodining ba'zi misollarini ko'rish va o'rganish uchun turli xil onlayn resurslarni tekshiring. Dartni o'zlashtirishga yordam beradigan eng foydali onlayn resurslardan ba'zilari:\n" +
                "\n" +
                "Rasmiy Dart sayti\n" +
                "Dart VM, Dart ishlab chiqish vositalari va Dart kutubxonalarini o'z ichiga olgan Dart SDK.\n" +
                "Dartpad, brauzerda Dart kodlarini yozish va ishga tushirish uchun onlayn vosita \n" +
                "Flutter tizimi orqali mobil ilovalarni qanday ishlab chiqishni tushuntiruvchi Flutter veb-sayti Dartdan foydalanadi .\n" +
                "4-qadam: Dart qanday ishlashi haqida asosiy tushunchaga ega bo'lgach, oddiy kodlar yoki buyruq qatori skriptlarini mashq qilishni boshlashingiz mumkin.\n" +
                "\n" +
                "5-qadam: Mobil ilovalar yaratish va ilg'or Dart ko'nikmalarini rivojlantirish uchun Flutter tizimidan foydalanishingiz mumkin."));

        list.add(new BookData(R.drawable.scala, "Scala dasturlash tili", "Scala  -  umumiy maqsadli dasturlash tili bo'lib , ob'ektga yo'naltirilgan dasturlashni ham  ,  funktsional dasturlashni ham  qo'llab-quvvatlaydi  . Til kuchli  statik  turdagi tizimga ega . Qisqacha qilib ishlab chiqilgan, Scala-ning ko'plab dizayn qarorlari Java tanqidlarini bartaraf etishga qaratilgan  .\n" +
                "\n" +
                "Scala manba kodi Java baytekodiga kompilyatsiya qilish uchun mo'ljallangan  , natijada bajariladigan kod  Java virtual mashinasida ishlaydi . Scala  Java  bilan  tilning o'zaro ishlashini ta'minlaydi , shuning uchun ikkala tilda yozilgan kutubxonalarga to'g'ridan-to'g'ri Scala yoki Java kodida murojaat qilish mumkin. Java singari, Scala ham  ob'ektga yo'naltirilgan va  C dasturlash tilini  eslatuvchi  jingalak qavs sintaksisidan foydalanadi . Java-dan farqli o'laroq, Scala sxema ,  standart ML  va  Haskell  kabi  funktsional dasturlash tillarining ko'plab xususiyatlariga ega  , jumladan,  karri ,  o'zgarmaslik ,  dangasa baholash va  naqshlarni moslashtirish . Shuningdek, u  algebraik ma'lumotlar turlarini ,  kovariatsiya va kontravariatsiyani ,  yuqori tartibli turlarni (lekin yuqori darajali turlarni  emas  ) va  anonim turlarni qo'llab-quvvatlaydigan ilg'or turdagi tizimga ega . Scala-ning Java-da mavjud bo'lmagan boshqa xususiyatlariga  operatorning haddan tashqari yuklanishi , ixtiyoriy parametrlar,  nomlangan parametrlar va  xom satrlar kiradi . Aksincha, Java-ning Scala-da bo'lmagan xususiyati tekshiriladi  istisnolar , bu bahsli bo'lib chiqdi.\n" +
                "\n" +
                "Scala nomi kengaytiriladigan  va  tilning portmantosi bo'lib  , u foydalanuvchilarning talablari bilan o'sishga mo'ljallanganligini bildiradi.\n" +
                "\n" +
                "Scala Java  va  C# bilan bir xil kompilyatsiya modeliga ega  , ya'ni alohida kompilyatsiya va  dinamik sinf yuklanishi , shuning uchun Scala kodi Java kutubxonalarini chaqirishi mumkin.\n" +
                "\n" +
                "Scala operatsion xususiyatlari Java bilan bir xil. Scala kompilyatori Java kompilyatori tomonidan yaratilgan deyarli bir xil bayt kodini ishlab chiqaradi. Aslida, Scala kodini  o'qish mumkin bo'lgan Java kodiga dekompilyatsiya qilish mumkin  , ba'zi konstruktor operatsiyalari bundan mustasno. Java virtual mashinasi (JVM) uchun   Scala kodi va Java kodini ajratib bo'lmaydi. Faqat bitta qo'shimcha ish vaqti kutubxonasi, scala-library.jar.\n" +
                "\n" +
                "Scala Java bilan solishtirganda juda ko'p xususiyatlarni qo'shadi va uning asosiy iboralar va turlar modelida ba'zi fundamental farqlarga ega, bu tilni nazariy jihatdan toza qiladi va Java-da bir nechta  burchak holatlarini yo'q qiladi  . Scala nuqtai nazaridan, bu amaliy ahamiyatga ega, chunki Scala-da bir nechta qo'shimcha funktsiyalar C# da mavjud.\n" +
                "\n" +
                "Java-da mavjud bo'lgan barcha ob'ektga yo'naltirilgan xususiyatlarni qo'llab-quvvatlagan holda (va aslida ularni turli yo'llar bilan to'ldiradi), Scala odatda faqat  funktsional dasturlash  tillarida mavjud bo'lgan juda ko'p imkoniyatlarni taqdim etadi. Bu xususiyatlar birgalikda Scala dasturlarini deyarli to'liq funktsional uslubda yozishga imkon beradi, shuningdek, funktsional va ob'ektga yo'naltirilgan uslublarni aralashtirishga imkon beradi.\n" +
                "\n" +
                "Bunga misollar:\n" +
                "\n" +
                "Bayonotlar va iboralar o'rtasida farq yo'q\n" +
                "Xulosa yozing\n" +
                "Semantikani yozib olish bilan anonim funktsiyalar  (ya'ni,  yopishlar )\n" +
                "O'zgarmas o'zgaruvchilar va ob'ektlar\n" +
                "Noto'g'ri baholash\n" +
                "Ajratilgan davomlar  (2.8 dan boshlab)\n" +
                "Yuqori darajadagi funktsiyalar\n" +
                "Ichki funksiyalar\n" +
                "Karriing\n" +
                "Shakl mosligi\n" +
                "Algebraik ma'lumotlar turlari  (  holatlar sinflari orqali )\n" +
                "Tuplar\n" +
                "Ekspressiv tip tizimi\n" +
                "Scala ekspressiv statik tizim bilan jihozlangan bo'lib, u asosan abstraktsiyalardan xavfsiz va izchil foydalanishni ta'minlaydi. Biroq, turdagi tizim unchalik  yaxshi emas . Xususan, turdagi tizim quyidagilarni qo'llab-quvvatlaydi:\n" +
                "\n" +
                " Ob'ekt a'zolari sifatida sinflar  va  mavhum turlar\n" +
                "Strukturaviy turlar\n" +
                "Yo'lga bog'liq turlar\n" +
                "Murakkab turlari\n" +
                "Aniq yozilgan o'ziga havolalar\n" +
                "Umumiy sinflar\n" +
                "Polimorfik  usullar\n" +
                "Yuqori va pastki turdagi chegaralar\n" +
                "Farqlanish\n" +
                "Izoh\n" +
                "Koʻrishlar\n" +
                "Scala foydalanish bo'yicha turlarni aniqlashga qodir   . Bu ko'pchilik statik turdagi deklaratsiyalarni ixtiyoriy qiladi. Statik turlar, agar kompilyator xatosi zaruratni ko'rsatmasa, aniq e'lon qilinishi shart emas. Amalda, kod aniqligi uchun ba'zi statik turdagi deklaratsiyalar kiritilgan."));

    }

}
