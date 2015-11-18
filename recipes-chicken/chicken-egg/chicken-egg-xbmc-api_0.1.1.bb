SECTION = "devel/chicken"
DESCRIPTION = "Implementation of the JSON-RPC based API for XBMC"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://xbmc-api.meta;md5=37175738b1a3cb0d2b66df9e732af294"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/xbmc-api/xbmc-api-${PV}.tar.gz"

SRC_URI[md5sum] = "c232d4e9d0db84c6165c08a4ff735d68"
SRC_URI[sha256sum] = "43ea2ced2dc9dd468432db8674752c343715a1a312c3ed74c02b55e1438cf982"

S = "${WORKDIR}/xbmc-api-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
