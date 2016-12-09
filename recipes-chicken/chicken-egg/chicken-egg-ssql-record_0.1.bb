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

SRC_URI[md5sum] = "dd8a9cbba928fb7ca3010732112fd78a"
SRC_URI[sha256sum] = "383dab3f4931cd4b5177c92785b644284f7e8ed79fd4fc215ad5b59f79f11b7a"

S = "${WORKDIR}/ssql-record-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
