SECTION = "devel/chicken"
DESCRIPTION = "Preferable exit codes"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://sysexits.meta;md5=960979697dd315dd7b3a26a850f67512"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/sysexits/sysexits-${PV}.tar.gz"

SRC_URI[md5sum] = "a7a2f9044d307120e0a6f3fd90fa0254"
SRC_URI[sha256sum] = "ee07ac9d648cf0c9ce5e87e51ca44664424e09d16b8e1fea5b26cf8c6468529b"

S = "${WORKDIR}/sysexits-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
