SECTION = "devel/chicken"
DESCRIPTION = "Character-set conversions"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://iconv.meta;md5=e8b4bfa6d4df8ff3265930b04f04e2c6"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/iconv/iconv-${PV}.tar.gz"

SRC_URI[md5sum] = "582283929280d280abfa58f187883465"
SRC_URI[sha256sum] = "b4c710d16fe04c58cb57c1b180e42e1089fa472533e4d4730287384778ecbd03"

S = "${WORKDIR}/iconv-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
