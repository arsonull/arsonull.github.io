﻿/*
 * Author: Carson Perry
 * Class: CST-247
 * Date: 8/8/21
 */


using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Threading.Tasks;

namespace CST247_Benchmark.Models
{
    public class BibleVerseModel
    {
        public int ID { get; set; }
        public string testament { get; set; }
        public string book { get; set; }
        public int bookNumber { get; set; }
        public int chapter { get; set; }
        public int verse { get; set; }
        public string text { get; set; }

        public BibleVerseModel(int id, int b, int c, int v, string t)
        {
            ID = id;
            if (b <= 39) testament = "Old Testament";
            else testament = "New Testament";
            //Long switch statement to set the book according to the number
            switch (b)
            {
                case 1:
                    book = "Genesis";
                    break;
                case 2:
                    book = "Exodus";
                    break;
                case 3:
                    book = "Leviticus";
                    break;
                case 4:
                    book = "Numbers";
                    break;
                case 5:
                    book = "Deuteronomy";
                    break;
                case 6:
                    book = "Joshua";
                    break;
                case 7:
                    book = "Judges";
                    break;
                case 8:
                    book = "Ruth";
                    break;
                case 9:
                    book = "1 Samuel";
                    break;
                case 10:
                    book = "2 Samuel";
                    break;
                case 11:
                    book = "1 Kings";
                    break;
                case 12:
                    book = "2 Kings";
                    break;
                case 13:
                    book = "1 Chronicles";
                    break;
                case 14:
                    book = "2 Chronicles";
                    break;
                case 15:
                    book = "Ezra";
                    break;
                case 16:
                    book = "Nehemiah";
                    break;
                case 17:
                    book = "Esther";
                    break;
                case 18:
                    book = "Job";
                    break;
                case 19:
                    book = "Psalms";
                    break;
                case 20:
                    book = "Proverbs";
                    break;
                case 21:
                    book = "Ecclesiastes";
                    break;
                case 22:
                    book = "Song of Songs";
                    break;
                case 23:
                    book = "Isaiah";
                    break;
                case 24:
                    book = "Jeremiah";
                    break;
                case 25:
                    book = "Lamentations";
                    break;
                case 26:
                    book = "Ezekiel";
                    break;
                case 27:
                    book = "Daniel";
                    break;
                case 28:
                    book = "Hosea";
                    break;
                case 29:
                    book = "Joel";
                    break;
                case 30:
                    book = "Amos";
                    break;
                case 31:
                    book = "Obadiah";
                    break;
                case 32:
                    book = "Jonah";
                    break;
                case 33:
                    book = "Micah";
                    break;
                case 34:
                    book = "Nahum";
                    break;
                case 35:
                    book = "Habakkuk";
                    break;
                case 36:
                    book = "Zephaniah";
                    break;
                case 37:
                    book = "Haggai";
                    break;
                case 38:
                    book = "Zechariah";
                    break;
                case 39:
                    book = "Malachi";
                    break;
                case 40:
                    book = "Matthew";
                    break;
                case 41:
                    book = "Mark";
                    break;
                case 42:
                    book = "Luke";
                    break;
                case 43:
                    book = "John";
                    break;
                case 44:
                    book = "Acts";
                    break;
                case 45:
                    book = "Romans";
                    break;
                case 46:
                    book = "1 Corinthians";
                    break;
                case 47:
                    book = "2 Corinthians";
                    break;
                case 48:
                    book = "Galatians";
                    break;
                case 49:
                    book = "Ephesians";
                    break;
                case 50:
                    book = "Philippians";
                    break;
                case 51:
                    book = "Colossians";
                    break;
                case 52:
                    book = "1 Thessalonians";
                    break;
                case 53:
                    book = "2 Thessalonians";
                    break;
                case 54:
                    book = "1 Timothy";
                    break;
                case 55:
                    book = "2 Timothy";
                    break;
                case 56:
                    book = "Titus";
                    break;
                case 57:
                    book = "Philemon";
                    break;
                case 58:
                    book = "Hebrews";
                    break;
                case 59:
                    book = "James";
                    break;
                case 60:
                    book = "1 Peter";
                    break;
                case 61:
                    book = "2 Peter";
                    break;
                case 62:
                    book = "1 John";
                    break;
                case 63:
                    book = "2 John";
                    break;
                case 64:
                    book = "3 John";
                    break;
                case 65:
                    book = "Jude";
                    break;
                case 66:
                    book = "Revelation";
                    break;
                default:
                    book = "Book Error";
                    break;
            }
            bookNumber = b;
            chapter = c;
            verse = v;
            text = t;
        }

        public BibleVerseModel()
        {

        }
    }
}
