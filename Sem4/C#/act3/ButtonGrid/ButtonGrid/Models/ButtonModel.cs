﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace ButtonGrid.Models
{
    public class ButtonModel
    {
        public int Id { get; set; }
        public int ButtonState { get; set; }

        public ButtonModel()
        {

        }
        public ButtonModel(int id, int bs)
        {
            Id = id;
            ButtonState = bs;
        }
    }
}
