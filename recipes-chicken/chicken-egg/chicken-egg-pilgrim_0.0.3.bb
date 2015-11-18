SECTION = "devel/chicken"
DESCRIPTION = "Barebones http kernel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://pilgrim.meta;md5=243b67c6cefb750800923dcf4b36e905"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/pilgrim/pilgrim-${PV}.tar.gz"

SRC_URI[md5sum] = "df9dc7ffa6c1ada944e4912dc247c57a"
SRC_URI[sha256sum] = "780407daf841cfa25bfa35bbdb4b5a0e5651f4643884e3850a703bf21ea47163"

S = "${WORKDIR}/pilgrim-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
