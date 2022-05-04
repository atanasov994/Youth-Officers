/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youthofficersgui;

import javax.swing.JOptionPane;

/**
 *
 * @author martin.atanasov
 */
public class YouthOfficersGui {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Officer officer1 = new Officer();
        Institution institution1 = new Institution();
        officer1.setNameOfOfficer("Стефан Дојчиновски");
        officer1.setContactOfOfficer("Stefan.dojchinoski@mod.gov.mk");
        institution1.setNameOfInstitution("Министерство за одбрана");
        
        Officer officer2 = new Officer();
        Institution institution2 = new Institution();
        officer2.setNameOfOfficer("Билјана Ѓоргиевски");
        officer2.setContactOfOfficer("Biljana_Gjorgievski@moi.gov.mk");
        institution2.setNameOfInstitution("Министерство за внатрешни работи");
        
        Officer officer3 = new Officer();
        Institution institution3 = new Institution();
        officer3.setNameOfOfficer("Мемет Жаку");
        officer3.setContactOfOfficer("Memet.Zhaku@mfa.gov.mk");
        institution3.setNameOfInstitution("Министерство за надворешни работи");
        
        Officer officer4 = new Officer();
        Institution institution4 = new Institution();
        officer4.setNameOfOfficer("Роберт Николоски");
        officer4.setContactOfOfficer("rober.nikoloski@finance.gov.mk");
        institution4.setNameOfInstitution("Министерство за финансии");
        
        Officer officer5 = new Officer();
        Institution institution5 = new Institution();
        officer5.setNameOfOfficer("Ирена Шекуткоска Јанакиевска");
        officer5.setContactOfOfficer("ijanakievska@mjustice.gov.mk");
        institution5.setNameOfInstitution("Министерство за правда");
        
        Officer officer6 = new Officer();
        Institution institution6 = new Institution();
        officer6.setNameOfOfficer("Давор Цветановски");
        officer6.setContactOfOfficer("davor.cvetanovski.zdravstvo.gov.mk");
        institution6.setNameOfInstitution("Министерство за здравство");
        
        Officer officer7 = new Officer();
        Institution institution7 = new Institution();
        officer7.setNameOfOfficer("Братољуб Шурлановиќ");
        officer7.setContactOfOfficer("bratoljub.shurlanovikj.mtc.gov.mk");
        institution7.setNameOfInstitution("Министерство за транспорт и врски");
        
        Officer officer8 = new Officer();
        Institution institution8 = new Institution();
        officer8.setNameOfOfficer("Локман Шаќри");
        officer8.setContactOfOfficer("llokman.shakiri@economy.gov.mk");
        institution8.setNameOfInstitution("Министерство за економија");
        
        Officer officer9 = new Officer();
        Institution institution9 = new Institution();
        officer9.setNameOfOfficer("Адем Меџити");
        officer9.setContactOfOfficer("adem.medziti@mzsv.gov.mk");
        institution9.setNameOfInstitution("Министерство за земјоделство, шумарство и водостопанство");
        
        Officer officer10 = new Officer();
        Institution institution10 = new Institution();
        officer10.setNameOfOfficer("Диар Селими");
        officer10.setContactOfOfficer("diar.selimi@mioa.gov.mk");
        institution10.setNameOfInstitution("Министерство за инфроматичко општество и администрација");
        
        Officer officer11 = new Officer();
        Institution institution11 = new Institution();
        officer11.setNameOfOfficer("Евгенија Јанакиеска");
        officer11.setContactOfOfficer("Evgenija.Janakieska@mon.gov.mk");
        institution11.setNameOfInstitution("Министерство за образование и наука");
        
        Officer officer12 = new Officer();
        Institution institution12 = new Institution();
        officer12.setNameOfOfficer("Ивона Кусакатска");
        officer12.setContactOfOfficer("ikusakatska@mtsp.gov.mk");
        institution12.setNameOfInstitution("Министерство за труд и социјална политика");
        
        Officer officer13 = new Officer();
        Institution institution13 = new Institution();
        officer13.setNameOfOfficer("Мартин Спасовски");
        officer13.setContactOfOfficer("martin.spasovski@mls.gov.mk");
        institution13.setNameOfInstitution("Министерство за локална самоуправа");
        
        Officer officer14 = new Officer();
        Institution institution14 = new Institution();
        officer14.setNameOfOfficer("Филип Ивановски");
        officer14.setContactOfOfficer("Filip.Ivanovski@kultura.gov.mk");
        institution14.setNameOfInstitution("Министерство за Култура");
        
        Officer officer15 = new Officer();
        Institution institution15 = new Institution();
        officer15.setNameOfOfficer("Милена Стојановска");
        officer15.setContactOfOfficer("m.stojanovska@moepp.gov.mk");
        institution15.setNameOfInstitution("Министерство за животна средина и просторно планирање");
        
        Officer officer16 = new Officer();
        Institution institution16 = new Institution();
        officer16.setNameOfOfficer("Зана Шабани");
        officer16.setContactOfOfficer("zana.shabani@live.com");
        institution16.setNameOfInstitution("Министерство за политички систем и односи меѓу заедниците");
        
        Officer officer17 = new Officer();
        Institution institution17 = new Institution();
        officer17.setNameOfOfficer("Насуф Демири");
        officer17.setContactOfOfficer("nasuf@ams.gov.mk");
        institution17.setNameOfInstitution("Агенција за млади и спорт");
        
        Officer officer18 = new Officer();
        Institution institution18 = new Institution();
        officer18.setNameOfOfficer("Симона Ристевска");
        officer18.setContactOfOfficer("simona@minisel.gov.mk");
        institution18.setNameOfInstitution("Министерство за иселеништво");
        
        Officer officer19 = new Officer();
        Institution institution19 = new Institution();
        officer19.setNameOfOfficer("Сања Белински");
        officer19.setContactOfOfficer("sbelinska@fva.gov.mk");
        institution19.setNameOfInstitution("Агенција за храна и ветеринарство");
        
        Officer officer20 = new Officer();
        Institution institution20 = new Institution();
        officer20.setNameOfOfficer("Петар Петковски");
        officer20.setContactOfOfficer("kovz@kovz.gov.mk");
        institution20.setNameOfInstitution("Комисија за односи со верските заедници и религиозните групи");
        
        Officer officer21 = new Officer();
        Institution institution21 = new Institution();
        officer21.setNameOfOfficer("Марјан Максимов");
        officer21.setContactOfOfficer("maksim.maksimov@geol.gov.mk");
        institution21.setNameOfInstitution("Геолошки завод на Република Северна Македонија");
        
        Officer officer22 = new Officer();
        Institution institution22 = new Institution();
        officer22.setNameOfOfficer("Синела Агович Бугариќ");
        officer22.setContactOfOfficer("Sinela.Agovic-Bugaric@sep.gov.mk");
        institution22.setNameOfInstitution("Секретаријат за европски прашања");
        
        Officer officer23 = new Officer();
        Institution institution23 = new Institution();
        officer23.setNameOfOfficer("Александар Јолевски");
        officer23.setContactOfOfficer("aleksandarjolevski@bro.gov.mk");
        institution23.setNameOfInstitution("Биро за развој на образование");
        
        Officer officer24 = new Officer();
        Institution institution24 = new Institution();
        officer24.setNameOfOfficer("Филип Сиљановски");
        officer24.setContactOfOfficer("filipsiljanovski90@gmail.com");
        institution24.setNameOfInstitution("Државен инспекторат за труд");
        
        Officer officer25 = new Officer();
        Institution institution25 = new Institution();
        officer25.setNameOfOfficer("Драгана Митов");
        officer25.setContactOfOfficer("dragana.mitov@ipardpa.gov.mk");
        institution25.setNameOfInstitution("Агенција за финансиска поддршка во земјоделството и руралниот развој");
        
        Officer officer26 = new Officer();
        Institution institution26 = new Institution();
        officer26.setNameOfOfficer("Еркин Хасан");
        officer26.setContactOfOfficer("erki_hasan10@live.com");
        institution26.setNameOfInstitution("Државен девизен инспекторат");
        
        Officer officer27 = new Officer();
        Institution institution27 = new Institution();
        officer27.setNameOfOfficer("Стефанија Јовиќевиќ");
        officer27.setContactOfOfficer("stefanija.jovikjevikj@ujp.gov.mk");
        institution18.setNameOfInstitution("Управа за јавни приходи");
        
        Officer officer28 = new Officer();
        Institution institution28 = new Institution();
        officer28.setNameOfOfficer("Шпејтим Алими");
        officer28.setContactOfOfficer("shpejtim.alimi@diti.gov.mk");
        institution28.setNameOfInstitution("Државен инспекторат за техничка инспекција");
        
        Officer officer29 = new Officer();
        Institution institution29 = new Institution();
        officer29.setNameOfOfficer("Дарко Блинков");
        officer29.setContactOfOfficer("d.blinkov@sei.gov.mk");
        institution29.setNameOfInstitution("Државен инспекторат за животна средина");
        
        Officer officer30 = new Officer();
        Institution institution30 = new Institution();
        officer30.setNameOfOfficer("Весна Миланова");
        officer30.setContactOfOfficer("vesna.milanova@mioa.gov.mk");
        institution30.setNameOfInstitution("Државен управен инспекторат");
        
        Officer officer31 = new Officer();
        Institution institution31 = new Institution();
        officer31.setNameOfOfficer("Верица Стефановска");
        officer31.setContactOfOfficer("verce.stefanovska@tourismmacedonia.gov.mk");
        institution31.setNameOfInstitution("Агенција за промоција и поддршка на туризам");
        
        Officer officer32 = new Officer();
        Institution institution32 = new Institution();
        officer32.setNameOfOfficer("Анѓелина Поповска");
        officer32.setContactOfOfficer("Angelina.Poposka@crm.org.mk");
        institution32.setNameOfInstitution("Централен регистар");
               
        Officer officer33 = new Officer();
        Institution institution33 = new Institution();
        officer33.setNameOfOfficer("Никола Станковски");
        officer33.setContactOfOfficer("nikola.stankovski@apprm.gov.mk");
        institution33.setNameOfInstitution("Агенција за поддршка на претприемништвото");
        
        Officer officer34 = new Officer();
        Institution institution34 = new Institution();
        officer34.setNameOfOfficer("Филип Торбаков");
        officer34.setContactOfOfficer("filip.torbakov@ea.gov.mk");
        institution34.setNameOfInstitution("Агенција за енергетика");
        
        Officer officer35 = new Officer();
        Institution institution35 = new Institution();
        officer35.setNameOfOfficer("Ненад Живковиќ");
        officer35.setContactOfOfficer("nenadzivkovic@aopz.gov.mk");
        institution35.setNameOfInstitution("Агенција за остварување на правата на заедниците");
        
        Officer officer36 = new Officer();
        Institution institution36 = new Institution();
        officer36.setNameOfOfficer("Неда Икономова");
        officer36.setContactOfOfficer("neda.ikonomova@fitr.gov.mk");
        institution36.setNameOfInstitution("Фонд за иновации");
        
        Officer officer37 = new Officer();
        Institution institution37 = new Institution();
        officer37.setNameOfOfficer("Мартин Атанасов");
        officer37.setContactOfOfficer("martin.atanasov@na.org.mk");
        institution37.setNameOfInstitution("Национална агенција за европски образовни програми и мобилност");
        
        Officer officer38 = new Officer();
        Institution institution38 = new Institution();
        officer38.setNameOfOfficer("Орданчо Данев");
        officer38.setContactOfOfficer("ordanco.danev@dsdskopje.mk");
        institution38.setNameOfInstitution("Државен студентски дом Скопје");
        
        Officer officer39 = new Officer();
        Institution institution39 = new Institution();
        officer39.setNameOfOfficer("Далила Чекиќ");
        officer39.setContactOfOfficer("d.chekik@is.gov.mk");
        institution39.setNameOfInstitution("Инспекциски совет");
        
        Officer officer40 = new Officer();
        Institution institution40 = new Institution();
        officer40.setNameOfOfficer("Сара Барути");
        officer40.setContactOfOfficer("sara.baruti@dzs.gov.mk");
        institution40.setNameOfInstitution("Дирекција за заштита и спасување");
        
        Officer officer41 = new Officer();
        Institution institution41 = new Institution();
        officer41.setNameOfOfficer("Аднан Мемиши");
        officer41.setContactOfOfficer("adnan.memishi@dcor.gov.mk");
        institution41.setNameOfInstitution("Македонска агенција за задолжителни нафтени резерви");
        
        Officer officer42 = new Officer();
        Institution institution42 = new Institution();
        officer42.setNameOfOfficer("Надица Доневски");
        officer42.setContactOfOfficer("nadica.peshovska@dzr.gov.mk");
        institution42.setNameOfInstitution("Државен завод за ревизија");
        
        Officer officer43 = new Officer();
        Institution institution43 = new Institution();
        officer43.setNameOfOfficer("Ивона Ацковска");
        officer43.setContactOfOfficer("Ivona.Ackovska@av.gov.mk");
        institution43.setNameOfInstitution("Агенција за вработување на Република Македонија");
        
        Officer officer44 = new Officer();
        Institution institution44 = new Institution();
        officer44.setNameOfOfficer("Теодора Атанасова и Марија Јанеска");
        officer44.setContactOfOfficer("mjanevska333@gmail.com и atanasova_teodora@yahoo.com");
        institution44.setNameOfInstitution("Агенција за национална безбедност");
        
        Officer officer45 = new Officer();
        Institution institution45 = new Institution();
        officer45.setNameOfOfficer("Филип Петрушевски");
        officer45.setContactOfOfficer("filip.petrushesvki@outlook.com");
        institution45.setNameOfInstitution("АД за изградба и стопанисување со стамбен и деловен простор");
        
        Officer officer46 = new Officer();
        Institution institution46 = new Institution();
        officer46.setNameOfOfficer("Катерина Цонева");
        officer46.setContactOfOfficer("katerina.coneva@piom.com.mk");
        institution46.setNameOfInstitution("Фонд за пензиско и инвалидско осигурување на РСМ");
        
        Officer officer47 = new Officer();
        Institution institution47 = new Institution();
        officer47.setNameOfOfficer("Александар Лазаров");
        officer47.setContactOfOfficer("aleksandar.lazarov@stat.gov.mk");
        institution47.setNameOfInstitution("Државен завод за статистика");
        
        Officer officer48 = new Officer();
        Institution institution48 = new Institution();
        officer48.setNameOfOfficer("Чедомир Мерџаноски");
        officer48.setContactOfOfficer("c.merdjanoski@dbki.gov.mk");
        institution48.setNameOfInstitution("Дирекција за безбедност на класифицирани информации");
        
        Officer officer49 = new Officer();
        Institution institution49 = new Institution();
        officer49.setNameOfOfficer("Џеладин Дурак");
        officer49.setContactOfOfficer("celadin.durak@mapas.mk");
        institution49.setNameOfInstitution("Агенција за супервизија на капитално финансирано пензиско осигурување");
        
        Officer officer50 = new Officer();
        Institution institution50 = new Institution();
        officer50.setNameOfOfficer("Филип Трајковски");
        officer50.setContactOfOfficer("filip.trajkovski@yahoo.com");
        institution50.setNameOfInstitution("Агенција за поттикнување на развојот на земјоделството");
        
        Officer officer51 = new Officer();
        Institution institution51 = new Institution();
        officer51.setNameOfOfficer("Соња Змејкоска");
        officer51.setContactOfOfficer("info@ippo.gov.mk");
        institution51.setNameOfInstitution("Државен завод за индустриска сопственост");
        
        Officer officer52 = new Officer();
        Institution institution52 = new Institution();
        officer52.setNameOfOfficer("Јетон Бучи");
        officer52.setContactOfOfficer("director@digu.gov.mk");
        institution52.setNameOfInstitution("Државен инспекторат за градежништво и урбанизам");
        
        Officer officer53 = new Officer();
        Institution institution53 = new Institution();
        officer53.setNameOfOfficer("Филип Стојаноски");
        officer53.setContactOfOfficer("filip.stojanoski19@gmail.com");
        institution53.setNameOfInstitution("Биро за регионален развој");
        
        JOptionPane.showMessageDialog(null, "Добредојдовте на страната за пребарување на службеници за млади");
        
        String name = JOptionPane.showInputDialog("Пишете го Вашето име ");
        JOptionPane.showMessageDialog(null, "Добредојде " + name);
        
        String officerFromInstitution = JOptionPane.showInputDialog("Одберете ја институцијата од која сакате да добиете информации за контакт со младинскиот службеник со внесување на соодветната бројка: \nМинистерство за одбрана 1"
                + " \nМинистерство за внатрешни работи 2, \nМинистерство за надворешни работи 3, \nМинистерство за финансии 4, "
                + " \nМинистерство за правда 5, \nМинистерство за здравство 6, \nМинистерство за транспорт и врски 7, \nМинистерство за економија 8"
                + " \nМинистерство за земјоделство, шумарство и водостопанство 9, \nМинистерство за инфроматичко општество и администрација 10,"
                + " \nМинистерство за образование и наука 11, \nМинистерство за труд и социјална политика 12, \nМинистерство за локална самоуправа 13"
                + " \nМинистерство за Култура 14, \nМинистерство за животна средина и просторно планирање 15, \nМинистерство за политички систем и односи меѓу заедниците 16, "
                + " \nАгенција за млади и спорт 17, \nМинистерство за иселеништво 18, \nАгенција за храна и ветеринарство 19, \nКомисија за односи со верските заедници и религиозните групи 20,"
                + " \nГеолошки завод на Република Северна Македонија 21, \nСекретаријат за европски прашања 22, \nБиро за развој на образование 23"
                + " \nДржавен инспекторат за труд 24, \nАгенција за финансиска поддршка во земјоделството и руралниот развој 25"
                + " \nДржавен девизен инспекторат 26, \nУправа за јавни приходи 27, \nДржавен инспекторат за техничка инспекција 28"
                + " \nДржавен инспекторат за животна средина 29, \nДржавен управен инспекторат 30"); 

        switch (officerFromInstitution){
            case "1":
                JOptionPane.showMessageDialog(null, officer1.getNameOfOfficer() + " е службеник за млади во " + institution1.getNameOfInstitution() + 
                        " и можете да го контактирате на " + officer1.getContactOfOfficer());
                break;
            case "2":
                JOptionPane.showMessageDialog(null, officer2.getNameOfOfficer() + " е службеник за млади во " + institution2.getNameOfInstitution() + 
                        " и можете да го контактирате на " + officer2.getContactOfOfficer());
                break;
            case "3":
                JOptionPane.showMessageDialog(null, officer3.getNameOfOfficer() + " е службеник за млади во " + institution3.getNameOfInstitution() + 
                        " и можете да го контактирате на " + officer3.getContactOfOfficer());
                break;
            case "4":
                JOptionPane.showMessageDialog(null, officer4.getNameOfOfficer() + " е службеник за млади во " + institution4.getNameOfInstitution() + 
                        " и можете да го контактирате на " + officer4.getContactOfOfficer());
                break;
            case "5":
                JOptionPane.showMessageDialog(null, officer5.getNameOfOfficer() + " е службеник за млади во " + institution5.getNameOfInstitution() + 
                        " и можете да го контактирате на " + officer5.getContactOfOfficer());
                break;
            case "6":
                JOptionPane.showMessageDialog(null, officer6.getNameOfOfficer() + " е службеник за млади во " + institution6.getNameOfInstitution() + 
                        " и можете да го контактирате на " + officer6.getContactOfOfficer());
                break;
            case "7":
                JOptionPane.showMessageDialog(null, officer7.getNameOfOfficer() + " е службеник за млади во " + institution7.getNameOfInstitution() + 
                        " и можете да го контактирате на " + officer7.getContactOfOfficer());
                break;
            case "8":
                JOptionPane.showMessageDialog(null, officer8.getNameOfOfficer() + " е службеник за млади во " + institution8.getNameOfInstitution() + 
                        " и можете да го контактирате на " + officer8.getContactOfOfficer());
                break;
            case "9":
                JOptionPane.showMessageDialog(null, officer9.getNameOfOfficer() + " е службеник за млади во " + institution9.getNameOfInstitution() + 
                        " и можете да го контактирате на " + officer9.getContactOfOfficer());
                break;
            case "10":
                JOptionPane.showMessageDialog(null, officer10.getNameOfOfficer() + " е службеник за млади во " + institution10.getNameOfInstitution() + 
                        " и можете да го контактирате на " + officer10.getContactOfOfficer());
                break;
            case "11":
                JOptionPane.showMessageDialog(null, officer11.getNameOfOfficer() + " е службеник за млади во " + institution11.getNameOfInstitution() + 
                        " и можете да го контактирате на " + officer11.getContactOfOfficer());
                break;
            case "12":
                JOptionPane.showMessageDialog(null, officer12.getNameOfOfficer() + " е службеник за млади во " + institution12.getNameOfInstitution() + 
                        " и можете да го контактирате на " + officer12.getContactOfOfficer());
                break;
            case "13":
                JOptionPane.showMessageDialog(null, officer13.getNameOfOfficer() + " е службеник за млади во " + institution13.getNameOfInstitution() + 
                        " и можете да го контактирате на " + officer13.getContactOfOfficer());
                break;
            case "14":
                JOptionPane.showMessageDialog(null, officer14.getNameOfOfficer() + " е службеник за млади во " + institution14.getNameOfInstitution() + 
                        " и можете да го контактирате на " + officer14.getContactOfOfficer());
                break;
            case "15":
                JOptionPane.showMessageDialog(null, officer15.getNameOfOfficer() + " е службеник за млади во " + institution15.getNameOfInstitution() + 
                        " и можете да го контактирате на " + officer15.getContactOfOfficer());
                break;
            case "16":
                JOptionPane.showMessageDialog(null, officer16.getNameOfOfficer() + " е службеник за млади во " + institution16.getNameOfInstitution() + 
                        " и можете да го контактирате на " + officer16.getContactOfOfficer());
                break;
            case "17":
                JOptionPane.showMessageDialog(null, officer17.getNameOfOfficer() + " е службеник за млади во " + institution17.getNameOfInstitution() + 
                        " и можете да го контактирате на " + officer17.getContactOfOfficer());
                break;
            case "18":
                JOptionPane.showMessageDialog(null, officer18.getNameOfOfficer() + " е службеник за млади во " + institution18.getNameOfInstitution() + 
                        " и можете да го контактирате на " + officer18.getContactOfOfficer());
                break;
            case "19":
                JOptionPane.showMessageDialog(null, officer19.getNameOfOfficer() + " е службеник за млади во " + institution19.getNameOfInstitution() + 
                        " и можете да го контактирате на " + officer19.getContactOfOfficer());
                break;
            case "20":
                JOptionPane.showMessageDialog(null, officer20.getNameOfOfficer() + " е службеник за млади во " + institution20.getNameOfInstitution() + 
                        " и можете да го контактирате на " + officer20.getContactOfOfficer());
                break;
            case "21":
                JOptionPane.showMessageDialog(null, officer21.getNameOfOfficer() + " е службеник за млади во " + institution21.getNameOfInstitution() + 
                        " и можете да го контактирате на " + officer21.getContactOfOfficer());
                break;
            case "22":
                JOptionPane.showMessageDialog(null, officer22.getNameOfOfficer() + " е службеник за млади во " + institution22.getNameOfInstitution() + 
                        " и можете да го контактирате на " + officer22.getContactOfOfficer());
                break;
            case "23":
                JOptionPane.showMessageDialog(null, officer23.getNameOfOfficer() + " е службеник за млади во " + institution23.getNameOfInstitution() + 
                        " и можете да го контактирате на " + officer23.getContactOfOfficer());
                break;
            case "24":
                JOptionPane.showMessageDialog(null, officer24.getNameOfOfficer() + " е службеник за млади во " + institution24.getNameOfInstitution() + 
                        " и можете да го контактирате на " + officer24.getContactOfOfficer());
                break;
            case "25":
                JOptionPane.showMessageDialog(null, officer25.getNameOfOfficer() + " е службеник за млади во " + institution25.getNameOfInstitution() + 
                        " и можете да го контактирате на " + officer25.getContactOfOfficer());
                break;
            case "26":
                JOptionPane.showMessageDialog(null, officer26.getNameOfOfficer() + " е службеник за млади во " + institution26.getNameOfInstitution() + 
                        " и можете да го контактирате на " + officer26.getContactOfOfficer());
                break;
            case "27":
                JOptionPane.showMessageDialog(null, officer27.getNameOfOfficer() + " е службеник за млади во " + institution27.getNameOfInstitution() + 
                        " и можете да го контактирате на " + officer27.getContactOfOfficer());
                break;
            case "28":
                JOptionPane.showMessageDialog(null, officer28.getNameOfOfficer() + " е службеник за млади во " + institution28.getNameOfInstitution() + 
                        " и можете да го контактирате на " + officer28.getContactOfOfficer());
                break;
            case "29":
                JOptionPane.showMessageDialog(null, officer29.getNameOfOfficer() + " е службеник за млади во " + institution29.getNameOfInstitution() + 
                        " и можете да го контактирате на " + officer29.getContactOfOfficer());
                break;
            case "30":
                JOptionPane.showMessageDialog(null, officer30.getNameOfOfficer() + " е службеник за млади во " + institution30.getNameOfInstitution() + 
                        " и можете да го контактирате на " + officer30.getContactOfOfficer());
                break;
     
            default:
                JOptionPane.showMessageDialog(null, "Почитувани, внесовте бројка која не се совпаѓа со бројките на доделените Институции \nобидете се повторно", "Грешка", JOptionPane.ERROR_MESSAGE);
                break;
                
                
                
            
    }
    
}}

    