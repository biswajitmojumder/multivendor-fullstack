import React from 'react'
import { Route, Routes } from 'react-router-dom'
import SellerDashboard from '../customer/seller/pages/SellerDashboard/SellerDashboard'
import { Dashboard } from '@mui/icons-material'
import Products from '../customer/seller/pages/Products/Products'

const SellerRoutes = () => {
  return (
    <div>
        <Routes>
            <Route path='/' element={<Dashboard />} />
            <Route path='/products' element={<Products />} />
        </Routes>
    </div>
  )
}

export default SellerRoutes