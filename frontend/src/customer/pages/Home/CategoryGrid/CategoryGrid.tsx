import React from "react";

const CategoryGrid = () => {
  return (
    <div className="grid gap-4 grid-rows-12 grid-cols-12 lg:h-[600px] px-5 lg:px-20">
      <div className="col-span-3 row-span-12 text-white">
        <img
          className="w-full h-full object-cover object-top rounded-md"
          src="https://kiabi.ma/cdn/shop/files/BVO42_1_ZC1_large.jpg?v=1728335534"
          alt=""
        />
      </div>

      <div className="col-span-2 row-span-6 text-white">
        <img
          className="w-full h-full object-cover object-top rounded-md"
          src="https://www.cdiscount.com/other/image-pc-sms-393x261-chaussures-cuir-p19-66680_210805172859.png?b74a3450-ec08-42fd-a381-b19083c7edda"
          alt=""
        />
      </div>
      <div className="col-span-4 row-span-6 text-white">
        <img
          className="w-full h-full object-cover object-top rounded-md"
          src="https://media.gqmagazine.fr/photos/648339f3ce0c708b2278ce97/16:9/w_2560%2Cc_limit/chemises.jpeg"
          alt=""
        />
      </div>
      <div className="col-span-3 row-span-12 text-white">
        <img
          className="w-full h-full object-cover object-top rounded-md"
          src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ3MknkNOQL-D5bteqNY4BzBIRxOQZeQkaDYw&s"
          alt=""
        />
      </div>
      <div className="col-span-4 row-span-6 text-white">
        <img
          className="w-full h-full object-cover object-top rounded-md"
          src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ3MknkNOQL-D5bteqNY4BzBIRxOQZeQkaDYw&s"
          alt=""
        />
      </div>
      <div className="col-span-2 row-span-6 text-white">
        <img
          className="w-full h-full object-cover object-top rounded-md"
          src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ3MknkNOQL-D5bteqNY4BzBIRxOQZeQkaDYw&s"
          alt=""
        />
      </div>
    </div>
  );
};

export default CategoryGrid;
