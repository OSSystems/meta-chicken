SECTION = "devel/chicken"
DESCRIPTION = "A simple egg to avoid SSQL boilerplate code when prototyping"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://ssql-record.meta;md5=9733b3422c3d3befe10cde2fcba88f30"
DEPENDS_append_class-cross = " chicken-egg-typed-records-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-typed-records-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-typed-records chicken-egg-typed-records-crosssdk"
DEPENDS = " chicken-egg-typed-records chicken-egg-typed-records-cross"
RDEPENDS_${PN} = " chicken-egg-typed-records"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/ssql-record/ssql-record-${PV}.tar.gz"

SRC_URI[md5sum] = "b3ab654082f573ce00694ba57f7757b6"
SRC_URI[sha256sum] = "3a3c845908ef1864c5d109a77e940a10eb59a0540a356a418ce5ce4c21d2253b"

S = "${WORKDIR}/ssql-record-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
