SECTION = "devel/chicken"
DESCRIPTION = "An XML-based template processor."
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://civet.meta;md5=f8f099db4e38c8c4be893f69ae6c5b15"
DEPENDS_append_class-cross = " chicken-egg-utf8-cross chicken-egg-uri-common-cross chicken-egg-ssax-cross chicken-egg-sxpath-cross chicken-egg-sxml-serializer-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-utf8-crosssdk chicken-egg-uri-common-crosssdk chicken-egg-ssax-crosssdk chicken-egg-sxpath-crosssdk chicken-egg-sxml-serializer-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-utf8 nativesdk-chicken-egg-uri-common nativesdk-chicken-egg-ssax nativesdk-chicken-egg-sxpath nativesdk-chicken-egg-sxml-serializer chicken-egg-utf8-crosssdk chicken-egg-uri-common-crosssdk chicken-egg-ssax-crosssdk chicken-egg-sxpath-crosssdk chicken-egg-sxml-serializer-crosssdk"
DEPENDS = " chicken-egg-utf8 chicken-egg-uri-common chicken-egg-ssax chicken-egg-sxpath chicken-egg-sxml-serializer chicken-egg-utf8-cross chicken-egg-uri-common-cross chicken-egg-ssax-cross chicken-egg-sxpath-cross chicken-egg-sxml-serializer-cross"
RDEPENDS_${PN} = " chicken-egg-utf8 chicken-egg-uri-common chicken-egg-ssax chicken-egg-sxpath chicken-egg-sxml-serializer"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/civet/civet-${PV}.tar.gz"

SRC_URI[md5sum] = "b64f9bdde4a748477b5ee31a20e0a095"
SRC_URI[sha256sum] = "0b4eddbe5d579926fabcbb37720497d888055c0ed24c9695fbac89948d176db1"

S = "${WORKDIR}/civet-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
