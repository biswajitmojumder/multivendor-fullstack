import React from "react";
import ReviewCard from "./ReviewCard";
import { Divider } from "@mui/material";

const Review = () => {
  return (
    <div className="p-5 lg:px-20 flex flex-col lg:flex-row gap-20">
      <section className="w-full md:w-1/2 lg:w-[30%] space-y-2">
        <img
          src="https://ma.jumia.is/unsafe/fit-in/500x500/filters:fill(white)/product/14/534605/1.jpg?9696"
          alt=""
        />

        <div>
          <div>
            <p className="font-bold text-xl">Raam Clothing</p>
            <p className="text-lg text-gray-600">Men's White Shirt</p>
          </div>
          <div className="price flex items-center gap-3">
            <span className="font-sans text-gray-800">$400</span>
            <span className="thin-line-through text-gray-400">$999</span>
            <span className="text-primary-color font-semibold">60%</span>
          </div>
        </div>
      </section>
      <section className="space-y-5 w-full">
        {[1, 1, 1, 1, 1, 1].map((item) => (
          <div className="space-y-3">
            <ReviewCard />
            <Divider />
          </div>
        ))}
      </section>
    </div>
  );
};

export default Review;
