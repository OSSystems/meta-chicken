SECTION = "devel/chicken"
DESCRIPTION = "Interface based sequence library"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://ftl.meta;md5=9e2c9b04360c9f49ec00650a67a1b309"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/ftl/ftl-${PV}.tar.gz"

SRC_URI[md5sum] = "d0438e371b5157cb68b1a984d15b7663"
SRC_URI[sha256sum] = "4beb8a576b10c15d79a5bafa665a3d24ba72ff96d82eff757ff32dae1ee7cc23"

S = "${WORKDIR}/ftl-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
