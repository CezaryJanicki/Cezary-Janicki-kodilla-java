package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
        private final List<ForumUser> theList = new ArrayList<>();

        public Forum() {
        theList.add(new ForumUser(123456, "Cezary", 'M', LocalDate.of(2020,12,15), 41));
        theList.add(new ForumUser(453532, "Marek", 'M', LocalDate.of(2010, 5,14), 41));
        theList.add(new ForumUser(456334, "Wojtek", 'M', LocalDate.of(1956,12,23), 13));
        theList.add(new ForumUser(342566, "Grzes", 'M', LocalDate.of(1999, 5, 25), 153));
        theList.add(new ForumUser(234577, "Pudzio", 'M', LocalDate.of(2005, 7, 14), 1654));
        theList.add(new ForumUser(564354, "Aga", 'F', LocalDate.of(2015, 12, 1), 341));
        theList.add(new ForumUser(543633, "Liga", 'F', LocalDate.of(2010, 2, 26), 561));
        theList.add(new ForumUser(234234, "Antonia", 'F', LocalDate.of(2016, 9, 19), 1642));
        theList.add(new ForumUser(654734, "Filip", 'M', LocalDate.of(1965, 6, 6), 166));
        theList.add(new ForumUser(564277, "Marzena", 'F', LocalDate.of(2012, 5,6), 462));
        theList.add(new ForumUser(754436, "Girzyna", 'F', LocalDate.of(1996,4,5), 3842));
        theList.add(new ForumUser(345345, "Wiedzmina", 'F', LocalDate.of(1978, 4, 5), 231));
        theList.add(new ForumUser(226677, "Malwin", 'M', LocalDate.of(1995, 2, 16), 1));
        theList.add(new ForumUser(664355, "Perpetua", 'F', LocalDate.of(1987, 5, 2), 1));
        theList.add(new ForumUser(245346, "Felicyt", 'M', LocalDate.of(1984, 2, 19), 11));
        theList.add(new ForumUser(975678, "Lufons", 'M', LocalDate.of(1684, 6, 10), 1231));
        theList.add(new ForumUser(785688, "Merkator", 'M', LocalDate.of(1988, 5, 24), 0));
        theList.add(new ForumUser(786333, "Bombina", 'F', LocalDate.of(1985, 12,  2), 133));
        theList.add(new ForumUser(123452, "Lucyna", 'F', LocalDate.of(2016, 8, 1), 2352));
        theList.add(new ForumUser(157543, "Marek", 'M', LocalDate.of(1999, 9, 9), 99));
        }
        public List<ForumUser> getUserList() {
            return new ArrayList<>(theList);
        }
}
