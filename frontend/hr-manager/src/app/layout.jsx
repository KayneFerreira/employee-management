import { Inter } from "next/font/google";
import "./globals.css";
import Navbar from "./components/Navbar";
import "bootstrap/dist/css/bootstrap.css";

const inter = Inter({ subsets: ["latin"] });

export const metadata = {
  title: "Protótipo Gerenciador de RH",
  description: "Protótipo Gerenciador de RH",
};

export default function RootLayout({ children }) {
  return (
    <html lang="pt-BR">
      <body className={inter.className}>
        <Navbar />
        <div className="container m-4">{children}</div>
      </body>
    </html>
  );
}
