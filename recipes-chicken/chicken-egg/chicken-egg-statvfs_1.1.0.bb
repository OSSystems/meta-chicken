SECTION = "devel/chicken"
DESCRIPTION = "Wrapper for the statvfs C function."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://statvfs.meta;md5=7f23fb268daedc4b4be9e7ddfcc8caf3"
DEPENDS_append_class-cross = " chicken-egg-foreigners-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-foreigners-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-foreigners chicken-egg-foreigners-crosssdk"
DEPENDS = " chicken-egg-foreigners chicken-egg-foreigners-cross"
RDEPENDS_${PN} = " chicken-egg-foreigners"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/statvfs/statvfs-${PV}.tar.gz"

SRC_URI[md5sum] = "29c89caea99b583ebf7ab13b17d015e3"
SRC_URI[sha256sum] = "44f28482359cabbdbbd1db507353621595dabc54c5285d9588ccdfa92db99a91"

S = "${WORKDIR}/statvfs-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
