SECTION = "devel/chicken"
DESCRIPTION = "EDN data reader/writer"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://edn.meta;md5=e887534338dace007902e99a9a65fd7e"
DEPENDS_append_class-cross = " chicken-egg-r7rs-cross chicken-egg-hahn-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-r7rs-crosssdk chicken-egg-hahn-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-r7rs nativesdk-chicken-egg-hahn chicken-egg-r7rs-crosssdk chicken-egg-hahn-crosssdk"
DEPENDS = " chicken-egg-r7rs chicken-egg-hahn chicken-egg-r7rs-cross chicken-egg-hahn-cross"
RDEPENDS_${PN} = " chicken-egg-r7rs chicken-egg-hahn"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/edn/edn-${PV}.tar.gz"

SRC_URI[md5sum] = "a4df1ae660012a714b500c5bef1604db"
SRC_URI[sha256sum] = "ce264757b3c316f47314d3cd781682a08dcb1de5ef7e6f2ac1a6bd4537ea7f6d"

S = "${WORKDIR}/edn-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
