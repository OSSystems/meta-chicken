SECTION = "devel/chicken"
DESCRIPTION = "A simple driver program for continuous integration scripts."
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://testdrive.meta;md5=5876c2a685b0aa7aa05f765d76afdde2"
DEPENDS_append_class-cross = " chicken-egg-regex-cross chicken-egg-uri-generic-cross chicken-egg-ersatz-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-regex-crosssdk chicken-egg-uri-generic-crosssdk chicken-egg-ersatz-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-regex nativesdk-chicken-egg-uri-generic nativesdk-chicken-egg-ersatz chicken-egg-regex-crosssdk chicken-egg-uri-generic-crosssdk chicken-egg-ersatz-crosssdk"
DEPENDS = " chicken-egg-regex chicken-egg-uri-generic chicken-egg-ersatz chicken-egg-regex-cross chicken-egg-uri-generic-cross chicken-egg-ersatz-cross"
RDEPENDS_${PN} = " chicken-egg-regex chicken-egg-uri-generic chicken-egg-ersatz"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/testdrive/testdrive-${PV}.tar.gz"

SRC_URI[md5sum] = "f8742498ecd3ee0d55300adea71d1479"
SRC_URI[sha256sum] = "cb6b2527967d1064fba73fbdb69f8c0bbeff721100f06f8424c45bba416d35fa"

S = "${WORKDIR}/testdrive-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
