package proxypattern

fun main() {
    val partBCompany = PartBCompany(PartACompany())

    partBCompany.implement()
}